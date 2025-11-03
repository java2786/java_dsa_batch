public class L707 {
    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList(); // []
        obj.read();
        // int param_1 = obj.get(1); // -1
        // obj.addAtHead(2); // [2]
        // obj.addAtTail(3); // [2, 3]
        // obj.addAtIndex(1,5); // [2,5,3]
        // obj.deleteAtIndex(1); // [2,3]
    }
}
class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}


class MyLinkedList {
    int size = 0;
    Node start = null;  // null
   
    public MyLinkedList() {
        // [4,3,6,2]
    }
    
    public int get(int index) {
        return 0;
    }
    
    public void addAtHead(int val) {
        
    }
    
    public void addAtTail(int val) {
        
    }
    
    public void addAtIndex(int index, int val) {
        
    }
    
    public void deleteAtIndex(int index) {
        
    }

    public void read(){
        Node copy = start;
        System.out.print("[");
        for(int i=0;i<size;i++){
            System.out.print(start.val);
            start = start.next;
        }
        System.out.println("]");
        start = copy;
    }
}

