public class MyQueue {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        System.out.println(q.size());
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.size());
        q.read();
        System.out.println(q.peek());
        System.out.println(q.poll());
        q.read();
        System.out.println(q.poll());
        q.read();
    }
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
    // 3,5,1,7,8

    // front insert -> 3->5->1->7->8 -> rear exit
    private int size = 0;
    private Node front = null;
    private Node rear = null;

    public void offer(int data) {
        Node node = new Node(data);
        size++;
        if (front == null) {
            front = node;
            rear = node;
        } else {
            node.next = front;
            front = node;
        }
    }

    public int poll() {
        if (rear == null) {
            return -1;
        }
        if (front == rear) {
            rear = front = null;
        }

        int data = rear.val;

        Node head = front;
        while (head.next.next != null) {
            head = head.next;
        }
        head.next = null;
        rear = head;
        size--;

        return data;
    }

    public int peek() {
        if (rear == null) {
            return -1;
        }
        return rear.val;
    }

    public int size() {
        return size;
    }

    public void read() {
        // [4->3->9->1->]
        //             h

        System.out.print("[");
        if (front != null) {
            Node head = front;
            while (head != null) {
                System.out.print(head.val + ",");
                head = head.next;
            }
        }
        System.out.println("]");
    }

}
