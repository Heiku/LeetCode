package Easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 637
 * 题目：给定一个非空二叉树, 返回一个由每层节点平均值组成的数组.
 *
 * 思路：使用bfs，每次for中计算平均值
 */
public class AverageOfLevels {


    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null){
            return list;
        }

        queue.offer(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            long sum = 0;

            for (int i = 0; i < size; i++){
                TreeNode node = queue.poll();

                sum += node.val;

                if (node.left != null){
                    queue.offer(node.left);
                }

                if (node.right != null){
                    queue.offer(node.right);
                }
            }

            double average = (double) sum / size;
            list.add(average);
        }

        return list;
    }



}
