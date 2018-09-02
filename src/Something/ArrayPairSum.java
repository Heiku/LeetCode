package Something;

import java.util.Arrays;

public class ArrayPairSum {
    public int arrayPairSum(int[] nums) {

        int n = nums.length / 2;

        Arrays.sort(nums);

        int sum = 0;
        for (int i = 0; i <= nums.length - 1; i+= 2){
            sum += Math.min(nums[i], nums[i+1]);
        }
        return sum;
    }


    public static void sort(int[] nums){
        int len = nums.length;
        for (int i = 1; i < len ; i++){
            for (int j = i ; j > 0  && nums[j] < nums[j-1]; j--){
                exch(nums, j-1, j);
            }
        }
    }

    public static void exch(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        int[] n = new int[]{9,1,5,6,7,2};
        ArrayPairSum pairSum = new ArrayPairSum();
        System.out.println(pairSum.arrayPairSum(n));
    }
}
