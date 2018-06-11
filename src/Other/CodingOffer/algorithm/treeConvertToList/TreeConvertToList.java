package Other.CodingOffer.algorithm.treeConvertToList;


/**
 * 题目：输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 *
 * 思路：中序遍历，为head初始化，在递归中，将head -> root, head <- root, head = root
 */

public class TreeConvertToList {

    TreeNode head = null;
    TreeNode realNode = null;

    public TreeNode Convert(TreeNode pRootOfTree) {

        if (pRootOfTree == null)
            return null;

        Convert(pRootOfTree.left);

        if (head == null){
            head = realNode = pRootOfTree;
        }else {
            head.right = pRootOfTree;
            pRootOfTree.left = head;
            head = pRootOfTree;
        }

        Convert(pRootOfTree.right);

        return realNode;
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