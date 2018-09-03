package base;

import java.util.Arrays;

/**
 * Created by Heiku on 2018/9/3
 *
 * 归并排序
 *
 * 分治的思想，两两数组归并合体
 */
public class MergeSort {

    public void mergeSort(int[] a, int lo, int hi){
        if (lo >= hi)
            return;

        int mid = (lo + hi) / 2;
        mergeSort(a, lo, mid);
        mergeSort(a, mid + 1, hi);

        merge(a, lo, mid, hi);
    }


    // 方法合并
    public void merge(int[] a, int lo, int mid, int hi) {
        int[] aux = Arrays.copyOfRange(a, lo, hi + 1);

        // i指向左半部分的索引位置，j为右边的位置
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++){
            if (i > mid){
                a[k] = aux[j - lo];
                j++;
            }else if (j > hi){
                a[k] = aux[i - lo];
                i++;
            }else if (aux[i - lo] < aux[j - lo]){
                a[k] = aux[i - lo];
                i++;
            }else {
                a[k] = aux[j - lo];
                j++;
            }
        }
    }


    public static void main(String[] args) {
        int []a = {5,4,2,1,7,3,9,6,8};
        new MergeSort().mergeSort(a, 0, a.length - 1);

        Arrays.stream(a).forEach(value -> System.out.print(value + " " ));
    }
}
