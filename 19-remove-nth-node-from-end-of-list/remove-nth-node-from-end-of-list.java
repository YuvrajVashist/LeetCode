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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        if(head.next == null && n == 1) return null;

        ListNode res = new ListNode(0);

        ListNode dummy = res;
        dummy.next = head;

        ListNode curr = dummy;
        ListNode prev = dummy;

        for(int i = 0;i<n;i++){
            curr = curr.next;
        }
        while(curr.next!=null){
            prev = prev.next;
            curr = curr.next;
        }
        prev.next = prev.next.next;
        return res.next;
        
    }
}