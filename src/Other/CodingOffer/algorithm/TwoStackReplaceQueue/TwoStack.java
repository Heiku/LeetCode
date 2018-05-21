package Other.CodingOffer.algorithm.TwoStackReplaceQueue;

import java.util.Stack;

/**
 * 题目：利用两个栈实现队列
 *
 *  思路：stack1用来进行入队操作。
 *      stack2用来进行出队
 *      每次出队都要判断stack，stack2是否为null，
 *      当stack2空时，需要将stack1的全部数据转进stack2中
 */
public class TwoStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public  void enQueue(int n){
        stack1.push(n);
    }

    public Integer deQueue(){

        if (stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("queue is empty");
        }

        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }
}
