package org.eu.qiao;


class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}


public class RandomListNodeClone {

    public RandomListNode Clone(RandomListNode pHead){
        if (pHead == null) {
            return null;
        }

        RandomListNode temp = pHead;
        while (temp != null){
            RandomListNode node = new RandomListNode(temp.label);
            node.next = temp.next;
            temp.next = node;
            temp = node.next;
        }
        RandomListNode res = pHead.next;

        temp = pHead;
        while (temp != null){
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        temp = pHead;
        while (temp != null){
            RandomListNode node = temp.next;
            temp.next = node.next;
            node.next = node.next == null ? null : node.next.next;
            temp = temp.next;
        }
        return res;
    }

}


