package Easy;

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {

        if (root == null){
            return null;
        }

        TreeNode node = root;
        node = root.left;
        root.left = root.right;
        root.right = node;

        invertTree(root.left);
        invertTree(root.right);


        return root;
    }
}