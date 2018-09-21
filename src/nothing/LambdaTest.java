package nothing;

import java.util.Arrays;

/**
 * Created by Heiku on 2018/9/19
 */
public class LambdaTest {

    public static void main(String[] args) {

        new Thread( () -> System.out.println("hello")).start();


    }
}
