package Other.CodingOffer.algorithm.rectCover;

/**
 * 题目：可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 *      请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *
 *
 * 思路：画图，类似于Fibonacci
 */
public class RectCover {
    public int rectCover(int n) {
        if (n <= 0)
            return 0;

        if (n == 1)
            return 1;

        if (n == 2)
            return 2;

        return rectCover(n-1) + rectCover(n-2);
    }
}
