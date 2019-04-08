package org.eu.qiao;

/**
 * @ClassNamg deleteDuplicationSolution
 * @Description todo
 * Author BOB
 * @Date 2019/4/7 20:39
 * @Version 1.0
 **/
public class deleteDuplicationSolution {

    public ListNode deleteDuplication(ListNode pHead){

        if (pHead == null || pHead.next == null) {
            return pHead;
        }

        ListNode first = pHead;
        ListNode second = pHead;
        while (second.next != null){
            if (second.val == second.next.val){
                second = second.next;
                first.next = second.next;
            }else {
                second = second.next;
                first = second;
            }
        }
        return pHead;

    }

}
