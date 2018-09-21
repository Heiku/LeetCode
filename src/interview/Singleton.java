package interview;



/**
 * 懒汉
 *
 * 加锁前后两次判断实例是否存在，提高效率
 *
 *
 *  为什么使用volatile呢？？
 *
 *  首先 singleton = new Singleton()；主要分为三部分：
 *      （1）为对象分配内存空间
 *      （2）对对象进行初始化操作
 *      （3）将singleton指向分配的内存空间
 *
 *      在多线程的环境下，有可能先进行（3）再进行（2）这是判断null就出现了问题导致尚未初始化好，但已经不为null的情况
 *
 * */
public class Singleton {
    volatile private static Singleton singleton = null;        // volatile 禁止重排序

    public Singleton() {
    }


    public static Singleton getInstance() {

        // 避免已创建对象还加锁，占资源
        if (singleton == null) {

            // 判断为null， 再加锁
            synchronized (Singleton.class) {

                // 保证对象在并发时不会重复创建
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
