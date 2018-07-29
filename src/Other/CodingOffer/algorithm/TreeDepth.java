package Other.CodingOffer.algorithm;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Heiku on 2018/7/29
 *
 * 题目：输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 *
 */
public class TreeDepth {
    /*public int TreeDepth(TreeNode root) {

        if (root == null)
            return 0;

        // 左树长度
        int left = TreeDepth(root.left);
        // 右树长度
        int right = TreeDepth(root.right);

        return left > right ? 1 + left : 1 + right;
    }*/

    public int TreeDepth(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        ((LinkedList<TreeNode>) queue).add(root);

        int depth = 0, count = 0, nextCount = 1;
        while (queue.size() != 0){
            TreeNode top = queue.poll();

            count++;
            if (top.left != null){
                ((LinkedList<TreeNode>) queue).add(top.left);
            }
            if (top.right != null)
                ((LinkedList<TreeNode>) queue).add(top.right);

            if (count == nextCount){    // 用nextCount 记录下同一行有多少节点，count++累加当其 ==nextCount，depth++
                nextCount = queue.size();
                count = 0;
                depth++;
            }


        }
        return depth;

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