package Easy;

public class MaxDepthTree {


    public int maxDepth(TreeNode root) {

        if (root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return (left > right) ? 1 + left : 1 + right;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
