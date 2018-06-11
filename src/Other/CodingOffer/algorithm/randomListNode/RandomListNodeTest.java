package Other.CodingOffer.algorithm.randomListNode;


/**
 * 题目：输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 *      返回结果为复制后复杂链表的head。
 *
 *  思路：分三步：1.遍历原链表，为每个原节点新建一个clone节点，原节点 -> clone节点
 *              2.遍历新链表，根据原节点的random 将 clone节点 random指向对应节点
 *              3.将新链表拆分为两个链表
 */
public class RandomListNodeTest {

    public RandomListNode Clone(RandomListNode pHead)
    {

        if (pHead == null)
            return null;

        // 1.
        RandomListNode currentNode = pHead;
        while (currentNode != null){
            RandomListNode newNode = new RandomListNode(currentNode.label);

            RandomListNode nextNode = currentNode.next;
            currentNode.next = newNode;
            newNode.next = nextNode;
            currentNode = nextNode;
        }



        // 2.
        currentNode = pHead;
        while (currentNode != null){

            RandomListNode nextNode = currentNode.next;
            nextNode.random = currentNode.random == null ? null : currentNode.random.next;

            currentNode = nextNode.next;
        }

        // 3.
        currentNode = pHead;
        RandomListNode head = currentNode.next;
        while (currentNode != null){

            RandomListNode cloneNode = currentNode.next;
            currentNode.next = cloneNode.next;

            cloneNode.next = cloneNode.next == null ? null : cloneNode.next.next;
            currentNode = currentNode.next;
        }
        return head;
    }
}
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}