package ready;

import java.util.Scanner;

/**
 * Created by Heiku on 2018/9/12
 *
 * 红黑积木求和
 */
public class XunLei_Second {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){

            int a = sc.nextInt();
            int b = sc.nextInt();

            int i = 1;
            for (; i < 7; i++){
                if (b * i + a * (7 - i) < 0)
                    break;

            }

            int x = 3;
            if ((7 - i) < 3)
                x = (7 - i) * a + (3 - (7 - i)) * b + (b * i + a * (7 - i)) * 2;
            else
                x = 3 * a + (b * i + a * (7 - i)) * 2;

            System.out.println(x);
        }
    }
}
