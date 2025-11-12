public class L707 {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(1);
        list.addAtTail(3);
        list.read();
        list.addAtIndex(1, 2);
        list.read();
        // 1, 2, 3
        System.out.println(list.get(1)); // 2
        list.deleteAtIndex(1); // 1,3 
        System.out.println(list.get(1)); // 3
        list.read();
    }

    public static void main2(String[] args) {
        MyLinkedList cortex = new MyLinkedList();
        // System.out.println(cortex.start.next.val);
        cortex.read();
        // cortex.read();
        int a = cortex.get(3);
        System.out.println(a);
        cortex.addAtHead(2);
        cortex.read();
        cortex.addAtIndex(3, 5);
        cortex.read();
        Node n1 = new Node(5);
        Node n2 = n1;
        n2.val = 20;
        System.out.println(n1.val);
    }

}

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class MyLinkedList {
    Node start = null;
    private int size = 0;

    public int size(){
        return size;
    }
    public MyLinkedList() {
        // Node n1 = new Node(4);
        // Node n2 = new Node(3);
        // Node n3 = new Node(5);
        // // Node n4 = new Node(6);
        // // Node n5 = new Node(7);

        // n1.next = n2;
        // n2.next = n3;
        // // n3.next = n4;
        // // n4.next = n5;
        // // n1 -> n2 -> n3 -> null
        // // 4 -> 3 -> 5 -> null
        // start = n1;
    }

    public int get(int index) {
        if (index >= size || index < 0 || start == null) {
            return -1;
        }

        Node head = start;
        for (int i = 0; i < index; i++) {
            start = start.next;
        }
        int a = start.val;
        start = head;
        return a;

    }

    void read() {
        Node head = start;
        if (start != null) {
            System.out.print("[");
            while (start != null) {
                System.out.print(start.val + "=>");
                start = start.next;
            }
            System.out.println("null]");
        } else {
            System.out.println("[]");
        }
        start = head;
    }

    void addAtHead(int val) {
        size++;
        // 5
        if (start == null) {
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
        if (start == null) {
            start = new Node(val);
        } else {
            Node head = start;
            while (head.next != null) {
                head = head.next;
            }
            head.next = new Node(val);
        }
    }

    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size){
            return;
        } else if(index == 0){
            addAtHead(val);
        } else if (index == size){
            addAtTail(val);
        } else {

        // ==
        Node head = start;
            for (int i = 0; i < index-1; i++) {
                head = head.next;
            }
            Node n = new Node(val);
            n.next = head.next;
            head.next = n;
            size++;
        }
    
    }

    public void deleteAtIndex(int index) {
        System.out.println("in delete: "+size);
        if (index >= size || index < 0 || start == null) {
            return;
        }
        if(index == 0){
            start = start.next;
            size--;
            return;
        }

        Node head = start;
        // in 2
        // [2=>4=>3=>5=>1=>null]
        //     h
        // [2=>4=>5=>1=>null]
        //     h
        for (int i = 0; i < index-1; i++) {
            head = head.next;
        }
        head.next = head.next.next;
        size--;
    }

}