package Something;


/**
 * 669
 *  题目：给定一个二叉搜索树，同时给定最小边界L 和最大边界 R。通过修剪二叉搜索树，使得所有节点的值在[L, R]中 (R>=L) 。
 *          你可能需要改变树的根节点，所以结果应当返回修剪好的二叉搜索树的新的根节点。
 *
 *  思路：根据二叉搜索树的特性：
 *         如果root的值在[L,R]之间，递归修剪其左右子树
 *         如果root的值 < L,抛弃其左子树
 *         如果root的值 > R,抛弃其右子树
 */
public class TrimBST {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root == null)
            return null;

        if (root.val < L)
            return trimBST(root.right, L, R);

        if (root.val > R)
            return trimBST(root.left, L, R);

        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);

        return root;
    }
}
