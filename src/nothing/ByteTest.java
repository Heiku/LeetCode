package nothing;

/**
 * Created by Heiku on 2018/9/21
 *
 * 负数 % 负数 = 负数
 */
public class ByteTest {

    public static void main(String[] args) {

        byte a = -64;
        byte b = -7;


        int c = -64;
        int d = -7;

        long e = -64;
        long f = -7;

        System.out.println(a/ b  + "  " + a % b);
        System.out.println(c/ d  + "  " + c % d);
        System.out.println(e/ f  + "  " + e % f);
    }
}
