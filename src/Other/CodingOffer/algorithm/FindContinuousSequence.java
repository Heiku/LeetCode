package Other.CodingOffer.algorithm;

import java.util.ArrayList;

/**
 * Created by Heiku on 2018/8/17
 *
 * 题目：小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 *      但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 *      没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 *      现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 *
 * 思路：滑动窗口，左右两指针，利用滑动判断大小
 */
public class FindContinuousSequence {

    // 暴力
    /*public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {

        ArrayList list = new ArrayList();

        for (int i = 1; i < sum; i++){

            int t = 0;
            ArrayList<Integer> integers = new ArrayList<>();
            for (int j = i; j <= sum; j++){
                if (t == sum){
                    list.add(integers);
                    break;
                }
                if (t > sum){
                    break;
                }
                integers.add(j);
                t += j;
            }
        }
        return list;
    }*/


    // 滑动窗口
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        int low = 1;
        int high = 2;

        while (low < high){

            ArrayList<Integer> integers = new ArrayList<>();

            // 等差数列求和 Sn = (a1 + an) * n / 2
            int cur = (low + high) * (high - low + 1) / 2;
            if (cur == sum){
                for (int i = low; i < high; i++){
                    integers.add(i);
                }
                lists.add(integers);
                low++;

            }else if (cur < sum){
                high++;
            }else {
                low++;
            }
        }
        return lists;
    }
}
