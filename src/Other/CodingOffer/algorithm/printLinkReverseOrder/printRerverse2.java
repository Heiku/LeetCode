package Other.CodingOffer.algorithm.printLinkReverseOrder;

import java.util.ArrayList;

/**
 * 递归判断节点是否null，再输出
 *
 *  存在问题：当链表非常长时，会导致函数调用的层数很深，从而导致函数调用栈溢出
 */
public class printRerverse2 {
    public static void printRerverse(ListNode node){
        if (node != null){
            printRerverse(node.next);
            System.out.println(node.val);
        }
    }
}
