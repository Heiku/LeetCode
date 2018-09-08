package ready;

import java.util.Scanner;

/**
 * Created by Heiku on 2018/9/8
 */
public class Second {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();


            int[] all = new int[n];
            int[] has = new int[n];


            int[] min = new int[n];
            int[] max = new int[n];
            for (int i = 0; i < n; i++){
                all[i] = sc.nextInt();
                has[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++){
                if (all[i] <= 2 || all[i] == has[i] || all[i] - has[i] <= 1){
                    min[i] = 0;
                    max[i] = 0;
                }else {
                    int t = all[i] - has[i];
                    if (t > has[i]){
                        min[i] = 0;
                        max[i] = t - 1;
                    }else {
                        min[i] = 0;
                        max[i] = t;
                    }
                }

            }

        }
    }
}
