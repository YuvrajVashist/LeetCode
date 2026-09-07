/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return head;
        }
        Node curr = head;
        
        //create the new list with next pointer
        while(curr!=null){
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }

        //copy the random pointer
        curr = head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        //separate the list
        curr = head;
        Node newCurr = head.next;
        Node newHead = head.next;
        while(curr!=null){
            curr.next = newCurr.next;
            if(curr.next!=null){
                newCurr.next = curr.next.next;
            }
            curr = curr.next;
            newCurr = newCurr.next;
        }
        return newHead;
    }
}