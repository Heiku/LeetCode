package Other.CodingOffer.algorithm.mirrorTree;

/**
 * 题目：操作给定的二叉树，将其变换为源二叉树的镜像。
 *
 * 思路：先交换根下的左右节点，递归左右子树
 */
public class MirrorTree {
    public void mirror(TreeNode root) {

        if (root == null)
            return ;

        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;

        mirror(root.left);
        mirror(root.right);
    }
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}