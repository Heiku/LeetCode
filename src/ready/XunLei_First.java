package ready;

import java.util.Scanner;

/**
 * Created by Heiku on 2018/9/12
 *
 * 计算勾股数个数
 */
public class XunLei_First {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){

            int n = sc.nextInt();

            int count = 0;
            for (int i = 1; i <= n; i++){
                for (int j = i; j <= n; j++){
                    for (int k = j; k <= n; k++){

                        int a = i * i;
                        int b = j * j;
                        int c = k * k;


                        if (i != k && i != j && j != k && a + b == c){
                            // 质数判断
                            if (isTrue(a, b) && isTrue(b, c) && isTrue(a, c)){
                                count++;
                            }
                        }

                    }
                }
            }

            System.out.println(count);
        }
    }

    private static boolean isTrue(int a, int b) {
        // 辗转相除法，循环判断质数
        while (true){
            int tmp = a % b;

            if (tmp == 0)
                break;
            else {
                a = b;
                b = tmp;
            }
        }

        return (b > 1) ? false : true;
    }
}
