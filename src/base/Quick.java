package base;

import java.util.Arrays;

/**
 * Created by Heiku on 2018/9/3
 *
 * 分治，切分，切点左边都小于切点，右边都大于切点
 */
public class Quick {

    public void quick(int []a, int lo, int hi){
        if (lo >= hi)
            return;

        int j = partition(a, lo, hi);
        quick(a, lo, j - 1);
        quick(a, j + 1, hi);
    }

    public int partition(int[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        int v = a[lo];


        while (true){

            while (v > a[++i]){
                if (i == hi)
                    break;
            }

            while (v < a[--j]) {
                if (j == lo)
                    break;
            }

            if (i >= j)
                break;

            swap(a, i, j);
        }

        swap(a, j, lo);

        return j;
    }

    void swap(int []a, int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        int []a = {5,4,2,1,7,3,9,6,8};
        new Quick().quick(a, 0, a.length - 1);

        Arrays.stream(a).forEach(value -> System.out.print(value + " "));
    }
}
