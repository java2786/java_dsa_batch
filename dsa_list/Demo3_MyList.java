class Node{
    int val;
    Node next;
    Node(int v){
        val = v;
        next = null;
    }
}
public class Demo3_MyList {
    // use array -> 15
    // add
    // remove
    // size
    // addFirst
    public static void main(String[] args) {
        Node n1 = new Node(5);
        Node n2 = new Node(12);
        Node n3 = new Node(4);

        // n1 -> n2 -> n3 -> null
        n1.next = n2;
        n2.next = n3;

        System.out.println(n1.next.next.val);
        // list.add()
        // list.get(2).val
    }
    
}
