package Other.CodingOffer.algorithm.jumpFloor;


/**
 * 题目：在前一题的基础上，可以直接跳n阶
 *
 * 思路：f(n) = f(n-1) + f(n-2) + ... + f(1)
 *         f(n-1) = f(n-2) + f(n-3) + ... + f(1)
 *
 *        f(n) = 2 * f(n -1)
 */
public class JumpFloorII {
    public int JumpFloorII(int n) {
        if (n <= 0)
            return 0;

        if (n == 1)
            return 1;

        if (n == 2)
            return 2;

        return 2 * JumpFloorII(n - 1);
    }
}
