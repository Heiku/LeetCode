package Other.CodingOffer.algorithm.reOrderArray;

/**
 * 题目：输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 *      使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 *      并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 *
 * 思路：插入排序
 */
public class ReOrderArray {
    public void reOrderArray(int [] array) {
        int n = array.length;

        // 记录奇数个数
        int k = 0;
        for (int i = 0; i < n; i++){
            if (array[i] % 2 == 1){
                int j = i;

                while (j > k){
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                    j--;
                }
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        ReOrderArray re = new ReOrderArray();
        re.reOrderArray(arr);
    }
}
