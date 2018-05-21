package Other.CodingOffer.algorithm.printLinkReverseOrder;

import java.util.LinkedList;
import java.util.Stack;


/**
 * 使用 stack 栈结构存储链表
 */
public class printRerverse1 {
    public static void printRerverse(ListNode node){

        Stack<Integer> stack = new Stack<>();

        while (node != null){
            stack.push(node.val);
            node = node.next;
        }

        while (stack.size() > 0){
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
