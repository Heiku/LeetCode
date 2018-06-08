package Other.CodingOffer.algorithm.isPopOrder;

import java.util.Stack;

/**
 * 题目：判断输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 *
 *  思路：循环将push[]中的元素入栈，在循环中判断pop[]中的是否与栈顶相同，相同则出栈。最后判断栈是否为空。
 */
public class IsPopOrder {

    public boolean isPopOrder(int [] pushA,int [] popA) {

        if (pushA.length == 0 || popA.length == 0)
            return false;

        int item = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < pushA.length; i++){
            stack.push(pushA[i]);

            while (item!= popA.length && stack.peek() == popA[item]){
                stack.pop();
                item++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int []push = {1,2,3,4,5};
        int []pop = {4,5,3,2,1};
        new IsPopOrder().isPopOrder(push, pop);
    }
}
