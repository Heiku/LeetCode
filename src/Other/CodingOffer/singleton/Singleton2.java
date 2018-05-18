package Other.CodingOffer.singleton;


/**
 * 懒汉
 *
 * 加锁前后两次判断实例是否存在，提高效率
 */
public class Singleton2{
    private static Singleton2 singleton = null;

    public Singleton2() {
    }


    public static Singleton2 getInstance(){

        // Double-check 双重判断避免强制加锁
        if (singleton == null){

            // 判断为null， 再加锁
            synchronized (Singleton2.class){

                // 加锁后实例仍然未创建
                if (singleton == null){
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }
}
