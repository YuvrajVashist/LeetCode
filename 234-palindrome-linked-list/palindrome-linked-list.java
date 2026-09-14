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
    public boolean isPalindrome(ListNode head) {
        if(head==null) return false;
        if(head.next==null) return true;
        ListNode temp=head;
        List<Integer>nodes=new ArrayList<>(); 
        while(temp.next!=null){
            nodes.add(temp.val);
            temp=temp.next;
        }nodes.add(temp.val);
        int j=nodes.size()-1;
        for(int i=0;i<j;i++){
          if(nodes.get(i)!=nodes.get(j)){
            return false;
          }
          j--;
        }
        return true;
    }
}