package Easy;

public class MergeTrees {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        TreeNode newTree;

        if (t1 == null){
            return t2;
        }else if (t2 == null){
            return t1;
        }else{
            newTree.val = t1.val + t2.val;
        }

        return
    }


    class TreeNode {
        int val;
        Easy.TreeNode left;
        Easy.TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}



