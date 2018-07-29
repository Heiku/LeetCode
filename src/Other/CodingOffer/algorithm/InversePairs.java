package Other.CodingOffer.algorithm;

/**
 * Created by Heiku on 2018/7/29
 *
 * 题目：在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 *      输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 *
 * 思路：利用归并排序的特点
 */
public class InversePairs {

    public int InversePairs(int [] array) {

        if (array == null || array.length == 0)
            return 0;

        int[] aux = new int[array.length];
        for (int i = 0; i < array.length; i++)
            aux[i] = array[i];

        int count  = InversePairsCore(array, aux, 0, array.length - 1);

        return count;
    }


    static int InversePairsCore(int[] array, int[] copy, int lo, int hi){
        if (lo == hi)
            return 0;

        int mid = (lo + hi) / 2;
        int leftCount = InversePairsCore(array, copy, lo, mid) % 1000000007;
        int rightCount = InversePairsCore(array, copy, mid + 1, hi) % 1000000007;

        int count = 0;
        int i = mid;
        int j = hi;
        int k = hi;

        while (i >= lo && j > mid){
            if (array[i] > array[j]){
                count += j - mid;

                copy[k--] = array[j--];
                if (count >= 1000000007){
                    count %= 1000000007;
                }
            }else {
                copy[k--] = array[j--];
            }
        }

        for (; i > lo; i--)
            copy[k--] = array[i];
        for (;j > mid; j--)
            copy[k--] = array[i];
        for (int s = lo; s <= hi; s++){
            array[s] = copy[s];
        }


        return (leftCount + rightCount + count) %1000000007;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};

        new InversePairs().InversePairs(arr);
    }
}
