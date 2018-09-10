package nothing;

/**
 * Created by Heiku on 2018/9/9
 */
public class StaticTest {
    public static void main(String[] args) {

        System.out.println(B.s);
    }
}

class B{

    public static final String s = new String("str");

    static {
        System.out.println("static B");
    }
}

class A extends B{



    static {
        System.out.println("static A");
    }
}
