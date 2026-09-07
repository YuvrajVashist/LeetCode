class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;

        Node curr = head;

        // 1. Create copied nodes and insert them after original nodes
        while(curr != null){
            Node newNode = new Node(curr.val);

            newNode.next = curr.next;
            curr.next = newNode;

            curr = newNode.next;
        }

        // 2. Copy random pointers
        curr = head;

        while(curr != null){
            if(curr.random != null){
                curr.next.random = curr.random.next;
            }

            curr = curr.next.next;
        }

        // 3. Separate original and copied lists
        curr = head;
        Node newHead = head.next;
        Node newCurr = newHead;

        while(curr != null){
            curr.next = newCurr.next;

            if(curr.next != null){
                newCurr.next = curr.next.next;
            }

            curr = curr.next;
            newCurr = newCurr.next;
        }

        return newHead;
    }
}