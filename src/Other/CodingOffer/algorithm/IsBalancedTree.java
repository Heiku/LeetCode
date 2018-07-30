package Other.CodingOffer.algorithm;

/**
 * Created by Heiku on 2018/7/30
 *
 * 题目：输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 *
 * 思路：后序遍历的的思想，得到左右的高度后，判断|leftDepth - rightDepth| > 1，是则unbanlance
 */
public class IsBalancedTree {
    boolean isBalance = true;
    public boolean IsBalanced_Solution(TreeNode root) {
        getDepth(root);

        return isBalance;
    }
    int getDepth(TreeNode root){
        if (root == null)
            return 0;

        int left = getDepth(root.left);
        int right = getDepth(root.right);

        if (Math.abs(left - right) > 1){
            isBalance = false;
        }

        return (left > right) ? left + 1 : right + 1;
    }
}


