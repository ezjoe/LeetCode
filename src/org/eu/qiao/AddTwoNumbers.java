package org.eu.qiao;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode ltemp = l3;
        int carry = 0;
        while(true) {
                if (l1 != null) {
                    carry += l2.val;
                    l1 = l1.next;
                }
                if (l2 != null) {
                    carry += l2.val;
                    l2 = l2.next;
                }
                if(carry>=10) {
                    l3.val=carry-10;
                    l3.next = new ListNode(1);
                    carry=1;
                }else{
                    l3.val=carry;
                    carry=0;
                }
                if(l1==null && l2==null){
                    break;
                }
                if(l3.next == null){
                    l3.next = new ListNode(0);
                }
                l3 = l3.next;
        }
        return ltemp;
    }
}
