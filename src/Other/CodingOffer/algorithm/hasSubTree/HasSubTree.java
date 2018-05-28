package Other.CodingOffer.algorithm.hasSubTree;

/**
 * 题目：输入两棵二叉树A，B，判断B是不是A的子结构。
 *
 * 思路：
 *
 */
public class HasSubTree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {

        boolean result = false;

        // 空值直接返回
        if (root1 != null && root2 != null){

            // 节点值相同才调用树递归判断
            if (root1.val == root2.val)
                result = DoesTree1HasTree2(root1, root2);

            // 从根节点的左半边寻找
            if (!result)
                result = HasSubtree(root1.left, root2);

            // 右半边
            if (!result)
                result = HasSubtree(root1.right, root2);
        }

        return result;
    }

    public static boolean DoesTree1HasTree2(TreeNode root1, TreeNode root2){

        // root2遍历完
        if (root2 == null)
            return true;

        // root2长于root1
        if (root1 == null)
            return false;

        // 值不相等直接返回false
        if (root1.val != root2.val)
            return false;

        return DoesTree1HasTree2(root1.left, root2.left) && DoesTree1HasTree2(root1.right, root2.right);

    }
}

class TreeNode{
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val){
        this.val = val;
    }
}
