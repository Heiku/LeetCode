package Other.CodingOffer.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Heiku on 2018/8/19
 *
 * 题目：请实现一个函数按照之字形打印二叉树，
 *      即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 *
 * 思路：BFS，根据列采取栈或队列的方式存放该层的元素，最后将元素加入list
 */
public class PrintZTree {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (pRoot == null)
            return lists;

        queue.offer(pRoot);

        ArrayList<Integer> rootList = new ArrayList<>();
        rootList.add(pRoot.val);
        lists.add(rootList);

        boolean flag = false;

        while (!queue.isEmpty()){

            int size = queue.size();
            ArrayList<Integer> integers = new ArrayList<>();
            Stack<TreeNode> stack1 = new Stack<>();
            Queue<TreeNode> queue2 = new LinkedList<>();

            for (int i = 0; i < size; i++){
                TreeNode root = queue.poll();

                if (root.left != null){
                    queue.offer(root.left);


                    if (!flag) {
                        stack1.push(root.left);
                    }else {
                        queue2.offer(root.left);
                    }
                }

                if (root.right != null){
                    queue.offer(root.right);


                    if (!flag) {
                        stack1.push(root.right);
                    }else {
                        queue2.offer(root.right);
                    }
                }
            }

            if(!flag){
                while (!stack1.isEmpty()){
                    integers.add(stack1.pop().val);
                }
            }else {
                while (!queue2.isEmpty()){
                    integers.add(queue2.poll().val);
                }
            }

            if (!integers.isEmpty())
                lists.add(integers);
            flag = !flag;
        }
        return lists;
    }
}
