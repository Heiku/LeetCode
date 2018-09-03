package base;

import java.util.Arrays;

/**
 * Created by Heiku on 2018/9/3
 *
 * 冒泡排序
 *
 * 每次循环互相交换位置，将较大的不断后移，直至最大的数在最后
 */
public class Bubble {

    public void bubble(int []a){

        for (int i = 0; i < a.length; i++){
            for (int j = 1; j < a.length - i; j++){
                if (a[j] < a[j - 1])
                    swap(a, j, j - 1);
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
        new Bubble().bubble(a);

        Arrays.stream(a).forEach(value -> System.out.print(value + " " ));
    }
}
