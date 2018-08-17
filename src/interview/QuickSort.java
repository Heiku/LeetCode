package interview;

import java.util.Arrays;

/**
 * Created by Heiku on 2018/8/15
 */
public class QuickSort {

    public void sort(int[] arr, int lo, int hi){
        if(lo >= hi)
            return;

        int j = partition(arr, lo, hi);
        sort(arr, lo, j - 1);
        sort(arr, j + 1, hi);
    }

    public int partition(int[] arr, int lo, int hi){
        int v = arr[lo];
        int i = lo, y = hi + 1;

        while (true){

            while (arr[++i] < v){
                if (i == hi)
                    break;
            }

            while (arr[--y] > v){
                if (y == lo)
                    break;
            }

            if (i >= y)
                break;

            exch(arr, i, y);
        }

        exch(arr, lo, y);
        return y;
    }

    public void exch(int[]arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {1,6,2,8,5,9,12,4,5};
        new QuickSort().sort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
