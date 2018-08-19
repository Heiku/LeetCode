package Other.CodingOffer.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Heiku on 2018/8/19
 *
 * 题目：从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 *
 * 思路：BFS
 */
public class PrintTree {

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (pRoot == null)
            return list;

        ArrayList<Integer> rootList = new ArrayList<>();
        rootList.add(pRoot.val);
        list.add(rootList);

        queue.offer(pRoot);
        while (!queue.isEmpty()){

            int size = queue.size();
            ArrayList<Integer> integers = new ArrayList<>();

            for (int i = 0; i < size; i++){
                TreeNode root = queue.poll();

                if (root.left != null){
                    integers.add(root.left.val);
                    queue.offer(root.left);
                }

                if (root.right != null){
                    integers.add(root.right.val);
                    queue.offer(root.right);
                }
            }

            if (!integers.isEmpty()) {
                list.add(integers);
            }
        }

        return list;
    }
}
