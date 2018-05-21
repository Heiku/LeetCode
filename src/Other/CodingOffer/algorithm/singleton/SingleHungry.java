package Other.CodingOffer.algorithm.singleton;


/**
 *  饿汉式单例（在调用getInstance之前就已经初始化单例），线程安全
 */
public class SingleHungry {

    private static SingleHungry singleHungry = new SingleHungry();

    public SingleHungry() {
    }

    public static SingleHungry getInstance(){
        return singleHungry;
    }
}
