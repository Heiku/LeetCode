package Other.CodingOffer.algorithm.findKthToTail;

import java.util.List;

public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {

        if (head == null || k < 0){
            return null;
        }

        ListNode p = head;
        ListNode q = head;

        int i = 0;
        for (; i < k && p != null;i++){
            p = p.next;
        }

        if (i > k){
            return null;
        }

        while (p != null){
            p = p.next;
            q = q.next;
        }
        return q;
    }
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}