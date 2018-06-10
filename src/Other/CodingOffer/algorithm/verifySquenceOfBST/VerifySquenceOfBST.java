package Other.CodingOffer.algorithm.verifySquenceOfBST;

/**
 * 题目：输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。
 *
 *
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
        if (start >= end)
            return true;


        int root = sequence[end];

        int i = start;
        while (sequence[i] < root){
            i++;
        }

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
