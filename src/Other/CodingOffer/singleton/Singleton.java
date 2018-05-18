package Other.CodingOffer.singleton;


/**
 *  懒汉式单例（只有在调用 getInstance 的时候，才回去初始化这个实例）
 *
 *  仅限于单线程模式下，线程不安全，在多线程状态下，在判断singleton 为 null，可能会产生多个实例
 */
public class Singleton {

    private static Singleton singleton = null;

    public Singleton() {
    }

    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }

        return singleton;
    }
}
