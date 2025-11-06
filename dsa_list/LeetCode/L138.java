public class L138 {
    
}
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
            return null;
        }

        Node start = head;

        // part 1 is to create same node after itself without random
        while(start!=null){
            Node temp = new Node(start.val);
            temp.next = start.next;
            start.next = temp;
            start = temp.next;
        }

        start = head;
        // part 2 is to assign random
        while(start!=null){
            if(start.random!=null)
                start.next.random = start.random.next;
            start = start.next.next;
        }

        // part 3 separate 2 lists
        start = head;
        Node newNode = start.next;
        Node newHead = newNode;

        while(start!=null){
            start.next = newNode.next;
            start = start.next;
            if(start != null){
                newNode.next = start.next;
                newNode = newNode.next;
            }
        }

        return newHead;
    }
}