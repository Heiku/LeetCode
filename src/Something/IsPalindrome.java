package Something;

/**
 * 9
 * 题目：判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 思路：逆序一半，判断特殊值
 */
public class IsPalindrome {

    // 1221 121
    public boolean isPalindrome(int x) {

        // 除去负数和尾数为0的数
        if (x < 0 || (x % 10 == 0) && (x != 0))
            return false;

        int reverseNum = 0;
        while (x > reverseNum){
            reverseNum = reverseNum * 10 +  x % 10;
            x /= 10;
        }

        // 数字位为偶数或奇数
        if (x == reverseNum || x == (reverseNum / 10))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        isPalindrome.isPalindrome(121);
    }
}
