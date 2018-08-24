package ready;

import java.util.Scanner;

/**
 * Created by Heiku on 2018/8/21
 *
 * 题目：链接：https://www.nowcoder.com/questionTerminal/661c49118ca241909add3a11c96408c8
 * 来源：牛客网
 *
 * 有 n 个学生站成一排，每个学生有一个能力值，牛牛想从这 n 个学生中按照顺序选取 k 名学生，要求相邻两个学生的位置编号的差不超过 d，
 * 使得这 k 个学生的能力值的乘积最大，你能返回最大的乘积吗？
 *
 * 链接：https://www.nowcoder.com/questionTerminal/661c49118ca241909add3a11c96408c8
 * 来源：牛客网
 *
 * 每个输入包含 1 个测试用例。每个测试数据的第一行包含一个整数 n (1 <= n <= 50)，表示学生的个数，接下来的一行，包含 n 个整数，
 * 按顺序表示每个学生的能力值 ai（-50 <= ai <= 50）。接下来的一行包含两个整数，k 和 d (1 <= k <= 10, 1 <= d <= 50)。
 *
 * input:
 * 3
 * 7 4 7
 * 2 50
 *
 * output:
 * 49
 */
public class Choir {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            // 总人数
            int n = sc.nextInt();

            int arr[] = new int[n + 1];
            for (int i = 0; i <= n; i++){
                arr[i] = sc.nextInt();
            }

            // 选择的学生数
            int k = sc.nextInt();
            // 间距差
            int d = sc.nextInt();

            long f[][] = new long[n][k+1];
            long g[][] = new long[n][k+1];


            // 一个学生的话，返回的值为对应的学生能力值
            for (int i = 1; i <= n; i++){
                f[i][1] = arr[i];
                g[i][1] = arr[i];
            }


            // 由底向上 dp[k][n]
            for (int i = 2; i <= k; k++){
                for (int j = i; j <= n; j++){

                    long tmpMax = Long.MAX_VALUE;
                    long tmpMin = Long.MIN_VALUE;

                    for (int left = Math.max(i - 1, j - d); left <= j - 1; left++){
                        if (tmpMax < Math.max(f[left][i - 1] * arr[j] , g[left][i - 1] * arr[j])){
                            tmpMax = Math.max(f[left][i - 1] * arr[j] , g[left][i - 1] * arr[j]);
                        }

                        if (tmpMin > Math.min(f[left][i - 1] * arr[j] , g[left][i - 1] * arr[j]) ){
                            tmpMin = Math.min(f[left][i - 1] * arr[j] , g[left][i - 1] * arr[j]);
                        }
                    }

                    f[j][i] = tmpMax;
                    g[j][i] = tmpMin;
                }
            }

            long result = Long.MIN_VALUE;
            for (int i = k; i <= n; i++){
                if (result < f[i][k]){
                    result = f[i][k];
                }
            }

            System.out.println(result);
        }
    }
}
