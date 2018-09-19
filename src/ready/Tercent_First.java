package ready;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Heiku on 2018/9/18
 */
public class Tercent_First {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){

            int n = sc.nextInt();

            int[] arr = new int[n];
            int less = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                arr[i] = a;

                if (a < 0)
                    less++;
            }

            int k = sc.nextInt();
            int max = arr[0];
            int cur = arr[0];

            for (int i = 1; i < n; i++){
                if (arr[i] < 0 && k > 0){
                    cur += -arr[i];
                    k--;
                }else {
                    cur += arr[i];
                }

                if (cur > max)
                    max = cur;
                else if(cur < 0)
                    cur = 0;
            }


           /*
            int sum = 0;
            for (int i = 0; i < n; i++){
                int cur = 0;
                for (int j = i; j < n; j++){
                    if (arr[j] < 0 && k > 0){
                        cur += -arr[j];
                        k--;
                    }else {
                        cur += arr[j];
                    }
                }

                sum = Math.max(cur, sum);
            }*/

            System.out.println(max);
        }
    }
}
