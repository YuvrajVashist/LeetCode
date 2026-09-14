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
    public ListNode partition(ListNode head, int x) {
        ListNode curr = head;
        ListNode less = new ListNode(-1);
        ListNode greater = new ListNode(-1);
        ListNode lessCurr = less;
        ListNode greaterCurr = greater;

        if(head == null || head.next == null){
            return head;
        }
        while(curr!=null){
            if(curr.val<x){
                lessCurr.next = curr;
                lessCurr = lessCurr.next;
            }
            else{
                greaterCurr.next = curr;
                greaterCurr = greaterCurr.next;
            }
            curr = curr.next;
        }
        lessCurr.next = greater.next;
        greaterCurr.next = null;
        return less.next;
        
    }
}