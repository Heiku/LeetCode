package base;

import java.util.Arrays;

/**
 * Created by Heiku on 2018/9/3
 *
 * 插入排序
 *
 * 始终保持前几位是有序的
 */
public class Insert {
    public void insert(int[] a){
        for (int i = 1; i < a.length; i++){
            for (int j = i; j > 0; j--){
                if (a[j] < a[j - 1]){
                    swap(a, j, j - 1);
                }
            }
        }
    }

    void swap(int []a, int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }


    public static void main(String[] args) {
        int []a = {5,4,2,1,7,3,9,6,8};
        new Insert().insert(a);

        Arrays.stream(a).forEach(value -> System.out.print(value + " "));
    }
}
