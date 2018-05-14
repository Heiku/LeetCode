package Easy;

/**
 * 283
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
