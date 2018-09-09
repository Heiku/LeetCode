package ready;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Heiku on 2018/9/9
 *
 * 完全多部图
 */
public class JD_Second {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int _i = 0; _i < T; _i++) {
            int N = in.nextInt();
            int M = in.nextInt();
            int[] du = new int[N + 1];
            for (int i = 0; i < M; i++) {
                int t1 = in.nextInt();
                int t2 = in.nextInt();
                du[t1]++;
                du[t2]++;
            }
            HashMap<Integer, Integer> du2num = new HashMap<>();
            for (int i = 1; i <= N; i++) {
                if (!du2num.containsKey(du[i])) {
                    du2num.put(du[i], 1);
                } else {
                    du2num.put(du[i], du2num.get(du[i]) + 1);
                }
            }
            boolean flag = true;
            for (int n : du2num.keySet()) {
                if (du2num.get(n) % (N - n) != 0)
                    flag = false;
            }
            if (flag)
                System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
