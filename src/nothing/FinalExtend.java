package nothing;

/**
 * Created by Heiku on 2018/9/10
 *
 *
 * 子类继承父类时，限定符需要 >= 父类
 *
 * Base b = new Sub()；实际上还是子类对象
 */

class Base{

    static {
        System.out.println("static base");
    }
    public void foo(){
        System.out.println("base");
    }
}

class Sub extends Base{
    public void foo(){
        System.out.println("sub");
    }
}

public class FinalExtend {
    public static void main(String[] args) {
        Base b = new Sub();

        b.foo();
    }
}
