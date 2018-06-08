package Other.CodingOffer.algorithm.printTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 题目：从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 *
 * 思路：bfs，利用队列queue存储节点，根据每个出队的首节点引入其节点对应的左右子节点。
 *
 */
public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null)
            return list;

        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();

            for (int i = 0; i < size; i++){
                TreeNode node = queue.poll();

                if (node.left != null){
                    queue.offer(node.left);
                }

                if (node.right != null){
                    queue.offer(node.right);
                }
                list.add(node.val);
            }
        }
        return list;
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
