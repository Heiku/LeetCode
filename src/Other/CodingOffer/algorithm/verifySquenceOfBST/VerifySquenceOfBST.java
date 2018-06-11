package Other.CodingOffer.algorithm.verifySquenceOfBST;

/**
 * 题目：输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。
 *
 * 思路：采用分治的思想，将整个数组分为左节点，右节点，左节点的值均小于root，右节点的值均大于root，
 */
public class VerifySquenceOfBST {

    public boolean verifySquenceOfBST(int [] sequence) {

        if (sequence.length == 0)
            return false;

        if (sequence.length == 1)
            return true;

        return judge(sequence, 0, sequence.length - 1);
    }

    public boolean judge(int[] sequence, int start, int end){

        // 当最后start 与 end重叠，即符合左节点小于root，右节点大于root
        if (start >= end)
            return true;

        // root是每次分完的最后一个
        int root = sequence[end];


        // 找到右节点起始位置
        int i = start;
        while (sequence[i] < root){
            i++;
        }


        // 右节点的每个数都应该比root大，若找到小的，return false
        int j = i;
        while (j < end){
            if (sequence[j] < root){
                return false;
            }
            j++;
        }

        boolean left = judge(sequence, start, i - 1);
        boolean right = judge(sequence, i, end - 1);

        return left && right;
    }
}
