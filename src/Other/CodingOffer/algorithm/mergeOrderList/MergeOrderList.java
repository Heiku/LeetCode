package Other.CodingOffer.algorithm.mergeOrderList;


/**
 * 题目：输入两个单调递增的链表，输出两个链表合成后的链表，
 *      当然我们需要合成后的链表满足单调不减规则。
 *
 *
 * 思路：递归解法：判断每个列表的首值，递归更新head节点，传递next节点
 */
public class MergeOrderList {
    public ListNode MergeOrderList(ListNode list1,ListNode list2) {

        if (list1 == null)
            return list2;

        if (list2 == null)
            return list1;

        ListNode head = null;

        if (list1.val < list2.val){
            head = list1;
            head.next = MergeOrderList(list1.next, list2);
        }else {
            head = list2;
            head.next = MergeOrderList(list1, list2.next);
        }

        return head;
        /*ListNode head = new ListNode(-1);
        ListNode root = head;
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                 head.next = list1;
                 list1 = list1.next;
                 head = list1;
            }else {
                head.next = list2;
                list2 = list2.next;
                head = list2;
            }
        }

        if (list1 != null)
            head.next = list1;

        if (list2 != null)
            head.next = list2;


        return root.next;*/
    }
}

class ListNode{
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
