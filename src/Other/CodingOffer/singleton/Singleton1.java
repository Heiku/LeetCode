package Other.CodingOffer.singleton;

/**
 *  懒汉
 *
 * 能在多线程下工作，但效率不高
 */
public class Singleton1 {
    private static Singleton1 singleton = null;

    public Singleton1() {
    }


    /**
     * 性能差，同步阻塞
     * @return
     */
    public static Singleton1 getInstance(){
        synchronized(Singleton1.class){
            if (singleton == null){
                singleton = new Singleton1();
            }
        }
        return singleton;
    }
}
