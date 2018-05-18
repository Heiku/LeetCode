package Easy;

/**
 * 283
 *
 * 解题思路：循环找到0，非0，交换（注意数组越界，有序等问题）
 *
 *          非零提前，其余补0
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {

        for(int i = 0; i < nums.length; i++){

            // find 0
            int j = i;
            while (j < nums.length - 1 && nums[j] != 0){
                j++;
            }

            // find not 0
            int k = i;
            while (k < nums.length - 1 && nums[k] == 0){
                k++;
            }

            if (j < k)
                exch(nums, j, k);
        }
    }

    void exch(int []nums, int j, int k){
        int tmp = nums[j];
        nums[j] = nums[k];
        nums[k] = tmp;
    }

    public static void main(String[] args) {
        int []nums = new int[]{1,0};
        MoveZeroes m = new MoveZeroes();
        m.moveZeroes(nums);
        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);
    }
}
