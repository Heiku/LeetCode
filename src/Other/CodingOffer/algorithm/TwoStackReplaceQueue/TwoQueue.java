package Other.CodingOffer.algorithm.TwoStackReplaceQueue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 利用两个队列实现栈
 *
 * 思路：将一个空队列和一个含元素的队列进行元素转换，返回含元素队列的最后一个元素
 */
public class TwoQueue {

    Queue<Integer> queue1 = new ArrayDeque<>();
    Queue<Integer> queue2 = new ArrayDeque<>();

    public void push(int num){
        if (queue1.isEmpty() && queue2.isEmpty()){
            queue1.add(num);
        }else if (queue2.isEmpty()){
            queue1.add(num);
        }else if (queue1.isEmpty()){
            queue2.add(num);
        }
    }


    public Integer pop(){
        if (queue1.isEmpty() && queue2.isEmpty()){
            System.out.println("queue is empty");
            return null;
        }

        if (queue1.isEmpty()){
            while (queue2.size() > 1){
                queue1.add(queue2.poll());
            }

            // 返回queue2的最后一个元素
            return queue2.poll();
        }

        if (queue2.isEmpty()){
            while (queue1.size() > 1){
                queue2.add(queue1.poll());
            }

            // 返回queue1的最后一个元素
            return queue1.poll();
        }

        return null;
    }
}
