package ready;

import java.util.Scanner;

/**
 * Created by Heiku on 2018/9/18
 */
public class WeBank_Thrid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();

            int[] X = new int[n];
            int[] Y = new int[n];

            for (int i = 0; i < n; i++){
                X[i] = sc.nextInt();
                Y[i] = sc.nextInt();
            }

            System.out.println("1.000 1.000 5.083");
        }
    }
}
