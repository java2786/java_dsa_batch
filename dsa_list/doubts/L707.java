public class L707 {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(3);
        linkedList.addAtHead(5);
        linkedList.addAtHead(2);
        // 2 -> 5 -> 3 -> null
        linkedList.addAtTail(6);
        linkedList.addAtTail(8);
        // 2 -> 5 -> 3 -> 6 -> 8 -> null
        linkedList.addAtHead(1);
        // 1 -> 2 -> 5 -> 3 -> 6 -> 8 -> null

        linkedList.addAtIndex(2, 5);
        // 1 -> 2 -> 5 -> 5 -> 3 -> 6 -> 8 -> null
        linkedList.addAtIndex(0, 5);
        // 5 -> 1 -> 2 -> 5 -> 5 -> 3 -> 6 -> 8 -> null
        
        linkedList.read();
        System.out.println(linkedList.size);
    }
}
class Node{
    int val;
    Node next;
    public Node(int v){
        this.val = v;
    }
}
class MyLinkedList {
    Node start = null;
    int size = 0;

    public MyLinkedList() {
        // Node n1 = new Node(4);
        // Node n2 = new Node(3);
        // Node n3 = new Node(5);

        // n1.next = n2;
        // n2.next = n3;
        // // n1 -> n2 -> n3 -> null
        // // 4 -> 3 -> 5 -> null
        // start = n1;
    }
    
    public int get(int index) {
        return 0;
    }
    
    public void addAtHead(int val) {
        size++;
        // 5
        if(start == null){
            start = new Node(val);
        } else {
            // 5 -> 3 -> 
            // 2 -> 5 -> 3 -> 
            Node n = new Node(val);
            n.next = start;
            start = n;
        }
    }
    
    public void addAtTail(int val) {
        size++;
        if(start == null){
            // null
            start = new Node(val); 
        } else {
            // 5 -> 3 -> 
            Node head = start;
            while(head.next!=null){
                head = head.next;
            }

            head.next = new Node(val);
        }
    }
    public void addAtIndex(int index, int val) {
        if(index<0 || index > size){
            System.out.println("Invalid index");
            return;
        } else if(index == 0){
            addAtHead(val);
        } else if (index == size){
            addAtTail(val);
        } else {
            Node head = start;
            // 2 -> 5 -> 3 ->
            // index 2 put 4
            // 2 -> 5 -> *4* -> 3 ->
            for(int i=0;i<index;i++){
                head = head.next;
            }
            Node n = new Node(val);
            n.next = head.next;
            head.next = n;
            size++;
        }

    }
    
    public void deleteAtIndex(int index) {
        
    }

    public void read(){
        Node head = start;
        if(start!=null){
            // 4 -> 3 -> 5 -> null
            System.out.print("[");
            while(start!=null){
                System.out.print(start.val+" -> ");
                // System.out.println(start.next.val);
                // System.out.println(start.next.next.val);
                start = start.next;
            }
            System.out.println("]");
        } else {
            System.out.println("[]");
        }
        start = head;
        // System.out.println(start.val);
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */