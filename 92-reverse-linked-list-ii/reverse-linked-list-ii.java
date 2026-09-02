/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = head;
        ListNode start = dummy;
        for(int i = 0;i<left-1;i++){
            curr = curr.next;
            start = start.next;
        }
        ListNode newCurr = curr;
    
        int reverse = right-left+1; 
        ListNode prev = null;
        for(int i = 0;i<reverse;i++){//3
            ListNode newNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newNode;
        }
        start.next= prev;
        newCurr.next = curr;
        return dummy.next;

    }
}