package Other.CodingOffer.algorithm.moreThanHalfNum;


/**
 * 题目：数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 *        例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 *
 *
 * 思路：使用士兵思想，将第一个当作士兵，当遇到自己的战友 count++（相同数字）
 *                                 当遇到敌人    count-- （不相同数字）
 *                                当count == 0，重新设置士兵，count++
 *
 *                                最后剩下的士兵为数量最多的，（包括牺牲的）
 *
 *      再一次for循环，统计所有该类型的士兵。
 */
public class MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int [] array) {

        int len = array.length;

        if (array == null || len <= 0)
            return 0;

        int count = 1;
        int num = array[0];
        for (int i = 1; i < len; i++){
            if (array[i] == num){
                count++;
            }else {
                count--;
            }

            if (count == 0){
                num = array[i];
                count++;
            }
        }

        count = 0;
        for (int i = 0; i < len; i++){
            if (array[i] == num){
                count++;
            }
        }

        if (count * 2 > len)
            return num;

        return 0;
    }
}
