package Other.CodingOffer.algorithm.reverseList;

/**
 * 输入一个链表，反转链表后，输出链表的所有元素。
 *
 * 思路：w
 */
public class ReverseList {
    public ListNode ReverseList(ListNode head) {

        if (head == null)
            return null;

        ListNode next = null;
        ListNode pre = null;

        while (head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
