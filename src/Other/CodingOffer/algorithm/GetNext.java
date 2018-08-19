package Other.CodingOffer.algorithm;

/**
 * Created by Heiku on 2018/8/19
 *
 * 题目：给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */
public class GetNext {

    public TreeLinkNode GetNext(TreeLinkNode pNode) {

        // 节点为空
        if (pNode == null)
            return null;


        // 当前节点为根节点，那么他的next为右节点下的左子树叶子节点
        if (pNode.right != null){
            pNode = pNode.right;

            while (pNode.left != null){
                pNode = pNode.left;
            }
            return pNode;
        }

        // 非根节点，如果该节点是父节点的左孩子，返回父节点。否则遍历向上
        while (pNode.next != null){
            TreeLinkNode root = pNode.next;
            if (root.left ==pNode){
                return root;
            }

            pNode = pNode.next;
        }

        return null;
    }
}
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}