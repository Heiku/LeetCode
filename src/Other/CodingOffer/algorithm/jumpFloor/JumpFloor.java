package Other.CodingOffer.algorithm.jumpFloor;

/**
 * 题目：一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 *      求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *
 * 思路：类似于 Fibonacci, 例如：f(4)
 *       可以从 f(3)跳一上去，也可以从 f(2)跳二上去
 */
public class JumpFloor {
    public static int jumpFloor(int n) {

        if (n <= 0)
            return 0;

        if (n == 1)
            return 1;

        if (n == 2)
            return 2;

        int pre1 = 1;
        int pre2 = 2;

        int result = 0;
        for (int i = 2; i < n; i++){
            result = pre1 + pre2;

            pre1 = pre2;
            pre2 = result;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(jumpFloor(3));
    }
}
