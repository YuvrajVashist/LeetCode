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
    public int getDecimalValue(ListNode head) {
        if(head == null){ 
            return 0;
        }
        if(head.next == null){
            if(head.val == 0){
                return 0;
            }
            else{
                return 1;
            }
        }
        ListNode temp = head;
        int length = 0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        
        //length 5 
        temp = head;
        int []arr = new int[length];
        int index = 0;
        while(temp!=null){
            arr[index] = temp.val;
            temp = temp.next;
            index++;
        }
        int res = 0;
        for(int i = 0;i<length;i++){
            res = res*2+arr[i];
        }
        // int res = binary;
        return res;

        
    }
}