package Something;

import java.util.HashMap;

/**
 * Created by Heiku on 2018/9/1
 */
public class FindShortestSubArray {

    public int findShortestSubArray(int[] nums) {
        if (nums == null)
            return 0;

        HashMap<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){

            if (!map.containsKey(nums[i])){
                map.put(nums[i], new int[]{1, i, i});
            }else {
                int[] tmp = map.get(nums[i]);

                tmp[0]++;
                tmp[2] = i;
            }
        }

        int maxNum = 0;
        int minLen = 0;
        for (int[] values : map.values()){
            if (values[0] > maxNum){
                minLen = values[2] - values[1] + 1;
                maxNum = values[0];
            }else if (values[0] == maxNum){
                minLen = Math.min(minLen, (values[2] - values[1] + 1));
            }
        }

        return minLen;
    }
}
