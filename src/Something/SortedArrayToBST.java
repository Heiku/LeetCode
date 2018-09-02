package Something;

public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {

        return sort(nums, 0, nums.length - 1);
    }


    public static TreeNode sort(int[] nums,int start,int end){

        if (start > end){
            return null;
        }
        int mid = (start + end) / 2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = sort(nums, start, mid-1);
        root.right = sort(nums, mid+1, end);
        return root;
    }



    public static void main(String[] args) {
        int []nums = {};
        SortedArrayToBST s = new SortedArrayToBST();
        s.sortedArrayToBST(nums);
    }

}
