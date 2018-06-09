package medium;


/**
 * 6.ZigZag Conversion
 *
 *  题目：The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 *          (you may want to display this pattern in a fixed font for better legibility)
 *
 *          P   A   H   N
 *          A P L S I I G
 *          Y   I   R
 *
 *          And then read line by line: "PAHNAPLSIIGYIR"
 *
 *          Write the code that will take a string and make this conversion given a number of rows:
 *
 * 思路：分几行就建立几个字符串，遍历原字符串，分为两种情况：
 *                      垂直列，每个字符串添加垂直列的首个字符，
 *                      倾斜列，每个字符串添加对应的字符，从下往上添加
 */
public class ZigZagConversion {

    /*public String convert(String s, int numRows) {

        char []c = s.toCharArray();
        int len = c.length;

        StringBuffer []sb = new StringBuffer[numRows];
        for (int i = 0; i < sb.length; i++)
            sb[i] = new StringBuffer();

        int i = 0;

        while (i < len){

            // 垂直方向
            for (int idx = 0; idx < numRows && i < len; idx++)
                sb[idx].append(c[i++]);

            //斜方向
            for (int idx = numRows - 2; idx >= 1 && i < len; idx--)
                sb[idx].append(c[i++]);

        }

        for (int idx = 1; idx < sb.length; idx++)
            sb[0].append(sb[idx]);

        return sb[0].toString();
    }*/


    public String convert(String s, int numRows) {
        int len = s.length();
        int nodeLen = 2*numRows-2;//两整列之间的差 也就是等差数列中的d
        String result = "";

        if (len == 0 || numRows == 0 || numRows == 1)//特殊情况特殊处理
            return s;

        for (int i = 0; i < numRows; i++)//从第一行遍历到最后一行
            for (int j = i; j < len; j += nodeLen) {
                result += s.charAt(j);//第一行和最后一行 还有普通行的整列数字
                if (i != 0 && i != numRows-1 && j - 2*i + nodeLen < len)
                    result += s.charAt(j - 2*i + nodeLen);//单列行的数字
            }

        return result ;
    }
    public static void main(String[] args) {
        new ZigZagConversion().convert("PAYPALISHIRING", 3);
    }
}
