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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode curr = head;
        int length = 1;
        while(curr.next!=null){
            length++;
            curr = curr.next;
        }
        if(k%length == 0){
            return head;
        }
        ListNode temp = head;
        k=k%length; //k=2
        int last = length-k;//3
        while(last-- >1){
            temp = temp.next;
        }
        ListNode newhead = temp.next;
        curr.next = head;
        temp.next = null;
        return newhead;

    }
}