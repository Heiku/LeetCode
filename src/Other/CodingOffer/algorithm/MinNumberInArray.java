package Other.CodingOffer.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Heiku on 2018/7/28
 *
 * 题目：输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 *      例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 *
 * 思路：关键在于比较数组中的相邻的元素相加之和 > 逆序相加之和 ? ab > ba ?
 *      可以采用暴力双重循环不停比较交换位置，也可以自定义排序其 Comparator，比较大小
 */
public class MinNumberInArray {

    public String PrintMinNumber(int [] numbers) {

        if(numbers.length == 0 || numbers == null)
            return "";
        if (numbers.length == 1)
            return String.valueOf(numbers[0]);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++){
            list.add(numbers[i]);
        }

        // 自定义排序器比较元素组合之间的大小
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String str1 = "" + o1 + o2;
                String str2 = "" + o2 + o1;

                return str1.compareTo(str2);
            }
        });

        StringBuilder builder = new StringBuilder();
        for (int i : list){
            builder.append(i);
        }

        return builder.toString();
    }
}
