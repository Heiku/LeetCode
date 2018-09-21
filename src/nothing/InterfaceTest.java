package nothing;

/**
 * Created by Heiku on 2018/9/20
 *
 * Java8接口新特性：static、default
 */

interface Hello{

    static void hello(){
        System.out.println("Hello");
    }


    // 该方法可以有方法体，实现了类可以不实现
    default String newInJava(){
        return "接口新特性";
    }
}
public class InterfaceTest implements Hello {


    @Override
    public String newInJava() {
        return "我可以选择重写接口方法也可以不重写";
    }


    public static void main(String[] args) {


        System.out.println(new InterfaceTest().newInJava());
    }
}
