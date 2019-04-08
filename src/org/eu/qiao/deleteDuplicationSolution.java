package org.eu.qiao;

/**
 * @ClassNamg deleteDuplicationSolution
 * @Description todo
 * Author BOB
 * @Date 2019/4/7 20:39
 * @Version 1.0
 **/
public class deleteDuplicationSolution {
    public static void main(String[] args) {
        deleteDuplicationSolution  deleteDuplicationSolution = new deleteDuplicationSolution();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        l1.next = l2;

        ListNode res = deleteDuplicationSolution.deleteDuplication(l1);

        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }

    }

    public ListNode deleteDuplication(ListNode pHead){

        if (pHead == null || pHead.next == null) {
            return pHead;
        }

        ListNode res = new ListNode(-1);
        res.next = pHead;
        ListNode p1 = res;
        ListNode p2= pHead;
        while (p2 != null && p2.next != null){
            if (p2.val == p2.next.val){
                while (p2.next != null && p2.val == p2.next.val){
                    p2 = p2.next;
                }

                p2 = p2.next;
                p1.next = p2;
            }else{
                p1 = p2;
                p2 = p2.next;
            }
        }
        return res.next;

    }

}
