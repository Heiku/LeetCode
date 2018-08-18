package Other.CodingOffer.algorithm;

/**
 * Created by Heiku on 2018/8/18
 *
 * 题目：将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，
 *      要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
 *
 * 思路：转化为char数组，对数组的首位判断正负，对其他位进行加法，注意数字的越界
 */
public class StrToInt {
    public int StrToInt(String str) {
        if (str == null || str.length() <= 0)
            return 0;

        char[] c = str.toCharArray();
        int sum = 0;
        int m = c.length - 1;
        int i = 0;
        if (c[0] > 57 || c[0] < 48){
            i++;
            m--;
        }

        for (; i < c.length; i++){
            if (c[i] <= 57 && c[i] >= 48 && c[0] == '-'){
                int n = -(c[i] - 48);
                sum += n * Math.pow(10, m);
                m--;
            }else if (c[i] <= 57 && c[i] >= 48) {
                int n = c[i] - 48;
                sum += n * Math.pow(10, m);
                m--;
            }
            else {
                return 0;
            }
        }
        /*if (sum == Integer.MAX_VALUE && c[0] == '-')
            return Integer.MIN_VALUE;*/

        // 判断正负
        /*if (c[0] == '-')
            return -sum;
*/

        // 最后判断是否越界

        return sum;
    }

    public static void main(String[] args) {
        String s = "-2147483648";
        new StrToInt().StrToInt(s);
    }
}

