/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp = node.next;
        // node = temp;
        node.val = node.next.val;
        node.next = node.next.next;
        // System.out.print(node.val);
    }
}