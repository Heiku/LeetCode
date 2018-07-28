package Other.CodingOffer.algorithm;


/**
 * 题目：求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 *
 * 思路：递归，利用 & 的判断错误会终止递归的特性
 */
public class SumWithOut {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean ans = (n > 0) && (sum += Sum_Solution(n - 1)) > 0;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new SumWithOut().Sum_Solution(3));
    }
}
