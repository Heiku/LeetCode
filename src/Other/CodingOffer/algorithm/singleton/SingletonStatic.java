package Other.CodingOffer.algorithm.singleton;


/**
 * 懒汉
 *
 * 静态内部类单例
 */
public class SingletonStatic {

    // 利用类加载机制，静态内部类只有被调用时才被首次加载
    private static class LazyHolder{
        private static final SingletonStatic INSTANCE = new SingletonStatic();
    }

    public SingletonStatic() {
    }

    public static final SingletonStatic getInstance(){
        return LazyHolder.INSTANCE;
    }
}
