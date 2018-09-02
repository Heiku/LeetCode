package Something;

import java.util.ArrayList;
import java.util.List;

/**
 *  257
 *  题目：给定一个二叉树，返回所有从根节点到叶子节点的路径。 ["1->2->5", "1->3"]
 *
 *  思路：使用深度遍历，在每次递归循环中记录str（路径），当到最后一个节点为null时，记录下最后的root节点，将整条路径添加到list中
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {

        ArrayList<String> list = new ArrayList<>();

        binaryTree(root, list, new String());

        return list;
    }

    private void binaryTree(TreeNode root, List<String> list, String str){

        if (root == null)
            return ;

        if (root.left == null && root.right == null){
            str = str + root.val;
            list.add(str);
            return;
        }

        binaryTree(root.left, list, str + root.val + "->");
        binaryTree(root.right, list, str + root.val + "->");

    }
}
