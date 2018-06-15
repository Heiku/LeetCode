package Other.CodingOffer.algorithm.getLeastNumbers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;


/**
 * 题目：输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 *
 * 思路：1.快速排序
 *      2.最大堆
 */
public class GetLeastNumbers {

    // 使用快排序
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        if (k > input.length)
            return list;

        sort(input, 0, input.length - 1);

        for (int i = 0; i < k; i++){
            list.add(input[i]);
        }

        return list;
    }


    public void sort(int []input, int lo, int hi){

        if (hi <= lo)
            return;

        int j = partition(input, lo, hi);
        sort(input, lo, j - 1);
        sort(input, j + 1, hi);
    }

    public int partition(int[] input, int lo, int hi){
        int v = input[lo];
        int i = lo, j = hi + 1;

        while (true){
            while (input[++i] < v){
                if (i == hi)
                    break;
            }

            while (v < input[--j]){
                if (j == lo)
                    break;
            }

            if (i >= j)
                break;

            swap(input, i, j);
        }
        swap(input, lo, j);
        return j;
    }

    public void swap(int []input, int i, int j){
        int tmp = input[i];
        input[i] = input[j];
        input[j] = tmp;
    }




    // 使用最大堆,先填满指定容量的最大堆，当剩余的数小于堆顶，则入堆，去除堆顶
    public ArrayList<Integer> GetLeastNumbers_Solution2(int [] input, int k) {

        ArrayList<Integer> list = new ArrayList<>();

        int len = input.length;
        if (k ==0 || k > len)
            return list;

        PriorityQueue<Integer> queue = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for (int i = 0; i < len; i++){
            if (queue.size() != k){
                queue.add(input[i]);
            }else if (queue.peek() > input[i]){
                Integer tmp = queue.poll();
                tmp = null;

                queue.offer(input[i]);
            }
        }

        for (Integer integer : queue)
            list.add(integer);
        return list;
    }
    public static void main(String[] args) {
        int []input = new int[]{4,5,1,6,2,7,3,8};
        new GetLeastNumbers().GetLeastNumbers_Solution(input, 1);
    }
}
