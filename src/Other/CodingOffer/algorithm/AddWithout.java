package Other.CodingOffer.algorithm;

/**
 * 题目：写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 *
 * 思路：二进制每位相加就相当于各位做异或操作，（& << 1 相当于进位）101^111，利用进位的思想，将num2不断左移，最终不需要移位，即得到最终的相加值
 */
public class AddWithout {
    public int Add(int num1,int num2) {
        while (num2 != 0){
            int tmp = num1 ^ num2;
            num2 = (num1 & num2) << 1;
            num1 = tmp;
        }
        return num1;
    }
}
