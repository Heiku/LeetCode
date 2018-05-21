package Other.CodingOffer.algorithm.reConstructBinaryTree;


/**
 * 题目：根据一棵二叉树的前序和中序数组，重新构造二叉树。
 *
 * 思路：前序特点：最前面的为根
 *      中序特点：根的左节点和右节点分别分布在根的左右两边
 *
 *      根据以上特点，可以利用递归构建二叉树
 *
 *     root.left = reConstruct(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
 *     root.right = reConstruct(pre, i - startIn + startPre + 1, endPre, in, i + 1, endIn);
 * 注意：在递归期间要注意中序的首节点对于不断划分的前序数组的影响。
 */
public class ReConstructBinaryTree {
    public static  TreeNode reConstruct(int[] pre, int[] in){
        TreeNode root = reConstruct(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return root;
    }


    public static TreeNode reConstruct(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
        if (startPre > endPre || startIn > endIn){
            return null;
        }

        TreeNode root = new TreeNode(pre[startPre]);

        for (int i = startIn; i <= endIn; i++){

            // 查找前序中序两数组中相同的值，即找出根节点的下标
            if (in[i] == pre[startPre]){

                root.left = reConstruct(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
                root.right = reConstruct(pre, i - startIn + startPre + 1, endPre, in, i + 1, endIn);
            }


        }

        return root;
    }

    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        reConstruct(pre, in);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

