package nothing;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/**
 * Created by Heiku on 2018/9/11
 */

class SumTask extends RecursiveTask<Integer>{

    // 每个小任务最多打印数量
    private static final int MAX = 70;
    private int[] arr;
    private int start;
    private int end;


    SumTask(int[] arr, int start, int end){
        this.arr = arr;
        this.start = start;
        this.end = end;
    }


    @Override
    protected Integer compute() {
        int sum = 0;

        if ((end - start) < MAX){
            for (int i = start; i < end; i++){
                sum += arr[i];
            }
            return sum;
        }else {
            System.out.println("---任务分解---");

            int middle = (start + end) / 2;
            SumTask left = new SumTask(arr, start, middle);
            SumTask right = new SumTask(arr, middle, end);

            // 并行执行两个任务
           /* left.fork();
            right.fork();*/

            invokeAll(left, right);


            // 结果合并
            return left.join() + right.join();
        }
    }

}

public class ForkJoinTest {
    public static void main(String[] args) throws Exception{

        int[] arr = new int[1000];
        Random random = new Random();

        int total = 0;


        // 初始计算
        for (int i = 0; i < arr.length; i++){
            int tmp = random.nextInt(100);
            total += (arr[i] = tmp);
        }

        System.out.println("初始化总和 = " + total);

        // ForkJoinPool线程池
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        // 将任务提交(submit 异步执行， invoke 同步执行)
        Future<Integer> future = forkJoinPool.submit(new SumTask(arr, 0, arr.length));

        System.out.println("计算出来的总和 = " + future.get());

        forkJoinPool.shutdown();
    }
}
