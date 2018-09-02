package Something;

import java.util.HashMap;

public class DistributeCandies {
    public int distributeCandies(int[] candies) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int candy : candies){
            if (map.containsKey(candy)){
                int val = map.get(candy);
                val++;
                map.replace(candy, val);
            }else {
                map.put(candy, 1);
            }
        }

        int len = candies.length;
        int diff = map.size();
        return Math.min(diff, len / 2);
    }


    public static void main(String[] args) {
        int []candies = new int[]{1000,1,1,1};
        DistributeCandies d = new DistributeCandies();
        d.distributeCandies(candies);
    }
}
