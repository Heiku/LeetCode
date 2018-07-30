package Other.CodingOffer.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Heiku on 2018/7/30
 *
 * 题目：一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。请写程序找出这两个只出现一次的数字。
 *      num1,num2分别为长度为1的数组。传出参数, 将num1[0],num2[0]设置为返回结果
 *
 * 思路：使用hashmap，简单粗暴
 *      使用异或，特点：相同的数异或等于0，2 ^ 2 = 0，抓住这个特点分析
 *               （1)将数组中所有元素异或，得到 不重复的两个数字的异或值
 *                    4 ^ 6  100
 *                         ^ 110
 *                           010
 *                (2)得到导致不同的位数1,即 010中的1的位数,
 *               （3）根据这个1的位数index，将数组中的数字按照 (>> index) & 1 == 1 ?判断原来的数字在该位是不是存在1，将原数组分为两个数组，
 *                      相同的数字会被分配到相同数组，不同的数字会按照上面的规则分在不同的数组，
 *                      相同数字进数组采用 ^= 的方式，即最后只会剩下不同的数字
 */
public class FindNumsAppearOnce {
    /*public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            if (map.containsKey(array[i])){
                int value = map.get(array[i]);
                value++;

                map.put(array[i], value);
            }else {
                map.put(array[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                list.add(entry.getKey());
            }
        }

        num1[0] = list.get(0);
        num2[0] = list.get(1);
    }*/

    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int len = array.length;
        if (len == 2) {
            num1[0] = array[0];
            num2[0] = array[1];
            return;
        }

        int b = 0;
        for (int i = 0; i < array.length; i++)
            b ^= array[i];

        int index = findFirst(b);
        for (int i = 0; i < len; i++){
            if (isBit(array[i], index))
                num1[0] ^= array[i];
            else
                num2[0] ^= array[i];
        }
    }

    int findFirst(int b){
        int index = 0;

        while (((b & 1) == 0 ) && index < 32){
            b >>= 1;
            index++;
        }
        return index;
    }


    boolean isBit(int target, int index){
        return ((target >> index) & 1) == 1;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,3,6,3,2,5,5};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        new FindNumsAppearOnce().FindNumsAppearOnce(arr, num1, num2);
    }
}
