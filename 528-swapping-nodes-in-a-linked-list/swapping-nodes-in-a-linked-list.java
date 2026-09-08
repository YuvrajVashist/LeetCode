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
    public ListNode swapNodes(ListNode head, int k) {
        int count = 0;
        ListNode curr = head;
        while(curr!=null){
            count++;
            curr = curr.next;
        }

        //count = 5
        curr = head;
        int[] arr = new int[count];
        int index = 0;
        while(curr!=null){
            arr[index] = curr.val;
            index++;
            curr = curr.next;
        }

        int n = arr.length-1;
        int temp = arr[n-k+1];
        arr[n-k+1] = arr[k-1];
        arr[k-1] = temp;

        curr = head;
        for(int i = 0;i<arr.length;i++){
            curr.val = arr[i];
            curr = curr.next;
        }
        return head;
    }
}