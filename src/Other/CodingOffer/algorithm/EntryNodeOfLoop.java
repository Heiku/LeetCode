package Other.CodingOffer.algorithm;

/**
 * Created by Heiku on 2018/8/18
 *
 * 题目：给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 *
 * 思路：单链表环：使用快，慢两个指针，快指针每次走2步，慢指针每次走1步，
 *                     如果存在环，那么他们必将在环中相遇
 *                     这时，将其中一个指针设置为初始节点，两个指针分别走一步，直到最后相遇，那么这个点就是环节点
 */
public class EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode fast = pHead;
        ListNode slow = pHead;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow)
                break;
        }

        if (fast == null)
            return null;

        fast = pHead;

        while (fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
