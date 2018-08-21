package ready;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Heiku on 2018/8/20
 *
 * 题目：
 *      输入的第一行包含一个整数n，表示目前已经出好的题目数量。
 *
 *      第二行给出每道题目的难度系数d1,d2,...,dn。
 *
 *      数据范围
 *
 *      对于30%的数据，1 ≤ n,di ≤ 5;
 *
 *      对于100%的数据，1 ≤ n ≤ 10^5,1 ≤ di ≤ 100。
 *
 *      在样例中，一种可行的方案是添加2个难度分别为20和50的题目，这样可以组合成两场考试：（20 20 23）和（35,40,50）。
 *
 *      input:
 *      4
 *      20 35 23 40
 *
 *      output:
 *      2
 */
public class NumbersOfProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] nums = new int[count];
        for (int i = 0; i < count; i++)
            nums[i] = sc.nextInt();

        if (count == 2)
            System.out.println(2);


        Arrays.sort(nums);
        // 指针下标
        int index = 0;
        // 组成3个题的个数
        int ret = 0;

        while (index < count){
            int c = 0;

            // 是否满足条件
            while (index + 1 < count && nums[index + 1] - nums[index] <= 10){
                index++;
                c++;

                if (c == 2)
                    break;
            }

            ret++;
            index++;
        }

        System.out.println(3 * ret - count);
    }
}
