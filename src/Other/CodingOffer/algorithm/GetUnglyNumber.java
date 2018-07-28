package Other.CodingOffer.algorithm;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Heiku on 2018/7/28
 *
 * 题目：把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。
 *  *      习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 *  *
 * 思路：所有丑数都是 p = 2^x * 3^y * 5^z，三指针对应x，y， z，每次找到最小的数，加入到丑数队列中，加入的数的下标右移，即++
 */
public class GetUnglyNumber {
    public int GetUglyNumber_Solution(int index) {

        if (index <= 0)
            return 0;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        int i2 = 0, i3 = 0, i5 = 0;
        while (list.size() < index){

            int m2 = list.get(i2) * 2;
            int m3 = list.get(i3) * 3;
            int m5 = list.get(i5) * 5;

            int min = Math.min(m2, Math.min(m3, m5));
            list.add(min);

            if (min == m2)
                i2++;

            if (min == m3)
                i3++;

            if (min == m5)
                i5++;
        }

        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        new GetUnglyNumber().GetUglyNumber_Solution(2);
    }
}
