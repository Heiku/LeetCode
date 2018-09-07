package ready;

import java.util.Scanner;

/**
 * Created by Heiku on 2018/9/7
 *
 * 牛牛以前在老师那里得到了一个正整数数对(x, y), 牛牛忘记他们具体是多少了。
 *
 * 但是牛牛记得老师告诉过他x和y均不大于n, 并且x除以y的余数大于等于k。
 * 牛牛希望你能帮他计算一共有多少个可能的数对。
 *
 *
 * 输入描述:
 * 输入包括两个正整数n,k(1 <= n <= 10^5, 0 <= k <= n - 1)。
 *
 *
 * 输出描述:
 * 对于每个测试用例, 输出一个正整数表示可能的数对数量。
 *
 * 输入例子1:
 * 5 2
 *
 * 输出例子1:
 * 7
 *
 * 例子说明1:
 * 满足条件的数对有(2,3),(2,4),(2,5),(3,4),(3,5),(4,5),(5,3)
 */
public class NumberCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();

        if (k == 0) {
            System.out.println(n * n);
            return;
        }

        long count = 0;

        for (long i = k + 1; i <= n; i++){
            //余数是从0到y-1循环的，
            //对于每个y值，x从1到n包含n/y个余数循环,
            //每个余数循环中只有y-k个符合条件的。
            count += (n / i) * (i - k);

            long temp = n % i;
            //剩下一个不完整的余数循环，判断这部分最大的余数是否大于k
            if (temp >= k){
                count += temp - k + 1;
            }
        }

        System.out.println(count);
    }
}
