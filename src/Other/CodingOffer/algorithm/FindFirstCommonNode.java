package Other.CodingOffer.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Heiku on 2018/7/29
 *
 * 题目：输入两个链表，找出它们的第一个公共结点。{1,2,3,6,7}{4,5,6,7}
 *
 * 思路：特点：从一个节点node开始，后面的节点都会相同
 *      （1）借助额外空间，利用HashMap的特点
 *       （2）不借助，根据两个链表的长度，选择一个较长的，将前节点的指针右移直到两个链表长度相同，
 *            1，2，3，6，7 -> 2,3,6,7
 *            4，5，6，7   ->  4,5,6,7
 *
 *        最后只要遍历找到第一个相同就行
 */
public class FindFirstCommonNode {


    /*public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null){
            return null;
        }

        Map<Integer, ListNode> map = new HashMap<>();
        while (pHead1 != null){
            map.put(pHead1.val, pHead2);
            pHead1 = pHead1.next;
        }

        while (pHead2 != null){
            if (map.containsKey(pHead2.val)){
                return pHead2;
            }else {
                pHead2 = pHead2.next;
            }
        }

        return null;
    }*/


    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null){
            return null;
        }
        if (pHead1 == pHead2)
            return pHead1;

        int len1= 0;
        int len2= 0;

        ListNode curr1 = pHead1;
        ListNode curr2 = pHead2;
        while (curr1 != null){
            len1++;
            curr1 = curr1.next;
        }
        while (curr2 != null){
            len2++;
            curr2 = curr2.next;
        }



        curr1 = pHead1;
        curr2 = pHead2;
        if (len1 > len2){
            int more = len1 - len2;
            while (more != 0){
                curr1 = curr1.next;
                more--;
            }
        }else {
            int more = len2 - len1;
            while (more != 0){
                curr2 = curr2.next;
                more--;
            }
        }


        while (curr1!=curr2 && curr2!= null){
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        return curr1;

    }
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
