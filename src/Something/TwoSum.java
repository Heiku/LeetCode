package Something;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example: [2,7,11,15] target: 9   return [0,1]
 */
public class TwoSum {

    // 二重循环
    /*public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return null;
    }*/


    // hashmap
    public int[] twoSum(int[] nums, int target) {

        Map<Integer , Integer> map = new HashMap<>();
        int[] total = new int[2];
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){

                total[0] = map.get(nums[i]);
                total[1] = i;

                return total;
            }else {
                map.put(target - nums[i], i);
            }
        }
        return total;
    }
}
