package nothing;

/**
 * Created by Heiku on 2018/9/20
 *
 * 方法重写：方法名，参数类型，个数，返回类型得相同，同时被重写的方法不能拥有更高的权限
 * 方法重载：方法名相同，参数类型，个数，返回类型都可不同，
 */
public class OverrideOrOverLoad {
}


class Fruit{

    String print(String str){
        System.out.println("This is " + str);

        return str;
    }
}


class Apple extends Fruit{

    @Override
    String print(String str) {
        System.out.println();

        return str;
    }
}
