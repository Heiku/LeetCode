package Other.CodingOffer.algorithm.findPathSum;

import java.util.ArrayList;

/**
 * 题目：输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 *
 * 思路：深度遍历，目标值target每次递减root.val，注意递归回退的时候，list。remove（）值
 */
public class FindPathSum {

    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    ArrayList<Integer> tmpList = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

        if (root == null){
            return list;
        }

        target -= root.val;
        tmpList.add(root.val);

        if (target == 0 && root.left == null && root.right == null)
            list.add(new ArrayList<>(tmpList));             //新建list，会存储对象引用，导致每次都是操作同一个list

        FindPath(root.left, target);
        FindPath(root.right, target);

        tmpList.remove(tmpList.size() - 1);


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