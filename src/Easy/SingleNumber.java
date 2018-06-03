package Easy;

/**
 * 136
 * 题目：给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 思路：运用位运算，满足异或交换不影响结果，相同数异或为0，不同为单独的数
 *
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {

        /*int len = nums.length;
        for (int i = 0; i < len; i++){
            int count = 0;
            for (int j = 0; j < len; j++){

                if (nums[i] == nums[j]){
                    count++;
                }
            }
            if (count < 2)
                return nums[i];
        }
        return 0;*/

        // 使用异或
        int n = 0;
        for (int i = 0; i < nums.length; i++){
            n ^= nums[i];
        }
        return n;
    }
}
