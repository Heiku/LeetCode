package base;

import java.util.Arrays;

/**
 * Created by Heiku on 2018/9/3
 *
 * 选择排序
 *
 * 选择最小索引号，交换位置
 */
public class Choose {
    public void choose(int []a){
        for (int i = 0; i < a.length; i++){

            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex])
                    minIndex = j;
            }

            swap(a, minIndex, i);
        }
    }


    void swap(int []a, int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        int []a = {5,4,2,1,7,3,9,6,8};
        new Choose().choose(a);

        Arrays.stream(a).forEach(value -> System.out.print(value + " "));
    }
}
