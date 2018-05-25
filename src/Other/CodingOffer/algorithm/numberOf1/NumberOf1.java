package Other.CodingOffer.algorithm.numberOf1;


/**
 * 题目：输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 *
 * 思路：循环将数减一再与原数进行与操作，直到数为0
 *
 */
public class NumberOf1 {
    public int numberOf1(int n) {

        /*// 可能陷入死循环
        int count = 0;
        while ((n & 1) == 1){
            count++;

            n >>= 1;
        }
        return count;*/

        //return Integer.bitCount(n);

        int count = 0;
        while (n != 0){
            count++;

            n = n & (n - 1);
        }

        return count;
    }
}
