package Other.CodingOffer.algorithm;

/**
 * Created by Heiku on 2018/8/19
 *
 * 题目：请实现两个函数，分别用来序列化和反序列化二叉树
 */
public class SerializeTree {
    String Serialize(TreeNode root) {

        StringBuilder sb = new StringBuilder();
        if (root == null){
            sb.append("#,");
            return sb.toString();
        }

        sb.append(root.val + ",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));

        return sb.toString();
    }

    int index = -1;
    TreeNode Deserialize(String str) {

        index++;

        int len = str.length();
        if (index >= len)
            return null;

        String[] s = str.split(",");
        TreeNode node = null;

        if (!s[index].equals("#")){
            node = new TreeNode(Integer.valueOf(s[index]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }

        return node;
    }
}
