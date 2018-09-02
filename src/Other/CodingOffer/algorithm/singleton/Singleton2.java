package Other.CodingOffer.algorithm.singleton;


/**
 * 懒汉
 *
 * 加锁前后两次判断实例是否存在，提高效率
 */
public class Singleton2{
    volatile private static Singleton2 singleton = null;        // volatile 禁止重排序

    public Singleton2() {
    }


    public static Singleton2 getInstance(){

        // 避免已创建对象还加锁，占资源
        if (singleton == null){

            // 判断为null， 再加锁
            synchronized (Singleton2.class){

                // 保证对象在并发时不会重复创建
                if (singleton == null){
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }
}
