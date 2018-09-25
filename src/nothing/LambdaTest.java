package nothing;

import java.util.Arrays;

/**
 * Created by Heiku on 2018/9/19
 */
public class LambdaTest {

    public static void main(String[] args) {

        new Thread( () -> System.out.println("hello")).start();

        int[] a = {3,2,1,5,3,4};

        Arrays.stream(a).forEach(e -> System.out.println(e));
    }
}
