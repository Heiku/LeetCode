package Other.CodingOffer.algorithm;

import java.util.ArrayList;

/**
 * Created by Heiku on 2018/8/17
 *
 * 题目：输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 *
 * 思路：左右逼夹，得到对应的sum
 */
public class FindNumbersWithSum {

    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {

        ArrayList<Integer> list = new ArrayList<>();
        if (array == null || array.length < 2)
            return list;

        int lo = 0;
        int hi = array.length -1;
        while (lo < hi){
            if (array[lo] + array[hi] == sum){
                list.add(array[lo]);
                list.add(array[hi]);
                break;
            }else if (array[lo] + array[hi] > sum){
                hi--;
            }else
                lo++;
        }

        return list;
    }
}
