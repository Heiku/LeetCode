package Easy;

import java.util.*;


/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 *
 * Example:
 *
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 *
 * A solution set is:
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 *
 */
public class TreeSum {

    public List<List<Integer>> threeSum(int[] num) {

        List<List<Integer>> lists = new LinkedList<>();

        Arrays.sort(num);
        for (int i = 0; i < num.length - 2; i++){
            if (i == 0 || (i > 0 && num[i] != num[i - 1])){
                int lo = i + 1;
                int hi = num.length - 1;
                int sum = 0 - num[i];

                while (lo < hi){
                    if (num[lo] + num[hi] == sum){
                        lists.add(Arrays.asList(num[i], num[lo], num[hi]));

                        // 排除重复的
                        while (lo < hi && num[lo] == num[lo+1])
                            lo++;
                        while (lo < hi && num[hi] == num[hi-1])
                            hi--;

                        lo++;
                        hi--;
                    }else if (num[lo] + num[hi] < sum){
                        lo++;
                    }else {
                        hi--;
                    }
                }
            }
        }

        return lists;
    }



    /*public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> lists = new ArrayList<>();

        List<Integer> origin = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            origin.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){

                int k = 0 - nums[i] - nums[j];
                if (origin.contains(k) && origin.indexOf(k) != i && origin.indexOf(k) != j){

                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(k);

                    lists.add(list);
                }
            }
        }
        return lists;
    }*/

    public static void main(String[] args) {
        int[] three = new int[]{-1,0,1,2,-1,-4};
        new TreeSum().threeSum(three);
    }
}
