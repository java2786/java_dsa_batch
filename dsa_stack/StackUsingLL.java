import java.util.Stack;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class MyStack2{
    private Node start = null;
    private int size = 0;

    // 3 -> 2 -> 1 ->
    public void push(int a){
        Node node = new Node(a);
        node.next = start;
        start = node;
        size++;
    }
    public int size(){
        return size;
    }
    
    public int peek(){
        if(start==null){
            System.out.println("Stack is empty");
            return -1;
        }
        return start.val;
    }
    public int pop(){
        if(start==null){
            return -1;
        }
        size--;
        int val = start.val;
        start = start.next;
        return val;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("]");
        Node head = start;
        while(head!=null){
            result.append(head.val);
            if(head.next!=null)
            result.append(",");
            head = head.next;
        }
            result.append("[");
        return result.reverse().toString();
    }
    
}

public class StackUsingLL {
    public static void main(String[] args) {
        MyStack2 s = new MyStack2();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s); //  1 2 3 
        System.out.println(s.peek()); // 3
        System.out.println(s.pop()); // 3
        System.out.println(s.peek()); // 2
        System.out.println(s.size()); // 2
    }
}
