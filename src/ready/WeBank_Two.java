package ready;

import java.util.Scanner;

/**
 * Created by Heiku on 2018/9/18
 */
public class WeBank_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){

            int[] len = new int[6];
            for (int i = 0; i < 6; i++){
                len[i] = sc.nextInt();
            }

            int sum = 0;
            sum += len[5];

            int all = 0;
            int max = 1024 * 6 * 6;
            for (int i = 0; i < 5; i++){
                int cur = (int) Math.pow(i + 1, 2) * len[i] * 1024;
                all += cur;

                if (all > max){
                    all = all - max;
                    sum++;
                }
            }

            if (all > 0)
                sum++;

            System.out.println(sum);
        }
    }
}
