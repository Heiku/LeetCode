package Other.CodingOffer.algorithm.findGreatestSum;


/**
 * 题目：找出连续数组的最大和    {6,-3,-2,7,-15,1,2,2}
 *
 * 思路：动态规划，sum记录下以array[i]末尾的和的最大值，res记录所有子数组的和的最大值
 */
public class FindGreatestSumOfSubArray {
    public int findGreatestSumOfSubArray(int[] array) {

        int len = array.length;

        int sum = array[0];
        int res = array[0];

        for (int i = 1; i < len; i++){
            sum = Math.max(sum + array[i], array[i]);
            res = Math.max(sum, res);
        }

        return res;
    }
}
