package Other.CodingOffer.algorithm;


/**
 * Created by Heiku on 2018/8/19
 *
 * 题目：在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 *      例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 *
 * 思路：三指针，pre用于存放前置节点，first用于有序的第一个，second判断下个是否相同
 *          先建立node，记录下头指针（最后返回的是头节点）
 *          接着，遍历链表，
 *                  如果 first.val == second.val，那么将second不断后移，直到找到不同的节点，
 *                  接着将 pre.next = second（second非重复节点）
 *                          first.next = second
 *
 *                  否则，节点后移
 *
 *                  最终返回node.next
 */
public class DeleteDuplication {
    public ListNode deleteDuplication(ListNode pHead) {

        if (pHead == null)
            return pHead;

        ListNode node = new ListNode(-1);
        node.next = pHead;

        ListNode pre = node;
        ListNode first = pHead;
        ListNode second = null;

        while (first != null && first.next != null){
            second = first.next;

            if (first.val == second.val){
                while (second != null && second.val == first.val){
                    second = second.next;
                }
                pre.next = second;
                first = second;

            }else {
                pre = first;
                first =first.next;

            }
        }

        return node.next;
    }
}
