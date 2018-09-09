package Something;

import java.util.*;

/**
 * Created by Heiku on 2018/9/9
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output: 321
 * Example 2:
 *
 * Input: -123
 * Output: -321
 * Example 3:
 *
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 *
 * 思路：使用循环
 * 123
 *
 * 3 32 321 ，注意越界Integer.Max，只要判断循环前后是否为原先的 / 10即可
 */
public class ReverseInterger {
    public int reverse(int x) {
        int res = 0;

        while (x != 0){
            int t = res * 10 + x % 10;
            if (t / 10 != res)
                return 0;

            res = t;
            x /= 10;
        }

        return res;

    }

    /*public int reverse(int x) {

        if (x == 0)
            return 0;

        Queue<Integer> queue = new LinkedList<>();

        boolean flag = true;
        int num = 0;
        if (x < 0)
            flag = false;

        num = Math.abs(x);

        int i = 0;
        while (num > 0){
            queue.offer(num % 10);
            num /= 10;
            i++;
        }


        long sum = 0l;
        while (!queue.isEmpty()){
            int tmp = queue.poll();
            if (tmp == 0) {
                i--;
                continue;
            }

            if (i > 0) {
                sum = tmp * (long)Math.pow(10, i - 1);
                i--;

                if (sum > Integer.MAX_VALUE)
                    return 0;

                num += sum;
            }
            else
                num += tmp;

        }


        if (!flag)
            return -num;
        else
            return num;


    }*/

    public static void main(String[] args) {
        new ReverseInterger().reverse(1534236469);
    }
}
