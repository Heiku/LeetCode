package ready;

import java.util.Scanner;

/**
 * Created by Heiku on 2018/9/16
 */
public class TreeSixZero_First {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){

            int n = sc.nextInt();

            int[] A = new int[n];
            int[] B = new int[n];

            for (int i = 0; i < n; i++){
                A[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++){
                B[i] = sc.nextInt();
            }


            int[] l = new int[n];
            int[] r = new int[n];
            for (int i = 0; i < n; i++){
                l[i] = i;
                r[i] = i - B[i] + 1;
            }


            int[] P = new int[n];
            for (int i = 0 ; i < n; i++){
                P[i] = Min(l[i], r[i], n) * Max(l[i], r[i], n);
            }

            System.out.println();
        }
    }

    private static int Max(int a, int b, int n) {

        return 0;
    }

    private static int Min(int a, int b, int n) {
        int min = 0;
        for (int i = 0; i < n ;i++){

        }
        return min;
    }
}
