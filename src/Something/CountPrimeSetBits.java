package Something;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 762
 * 题目：给定两个整数 L 和 R ，找到闭区间 [L, R] 范围内，计算置位位数为质数的整数个数。
 *
 *
 */
public class CountPrimeSetBits {
    public int countPrimeSetBits(int L, int R) {

        HashSet<Integer> set = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17,19));
        int n  = 0;
        for (int i = L; i <= R; i++){

            int count = 0;

            int temp = i;
            while (temp > 0){
                if ((temp& 1) == 1)
                    count++;
                temp >>= 1;

            }

            if (set.contains(count)){
                n++;
            }

        }
        return n;
    }
}
