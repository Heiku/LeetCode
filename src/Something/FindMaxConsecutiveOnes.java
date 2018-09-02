package Something;

public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                count++;
                if (count > max)
                    max = count;
            }else {
                if (count > max){
                    max = count;
                }
                count = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int []n= new int[]{1,1,0,1};
        FindMaxConsecutiveOnes f = new FindMaxConsecutiveOnes();
        f.findMaxConsecutiveOnes(n);
    }
}
