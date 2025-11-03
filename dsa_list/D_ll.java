import java.util.LinkedList;

public class D_ll {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();  // []
        list.add(5); // [5]
        list.add(3); // [5, 3]
        list.add(1, 6); // [5,6,3]
        list.addFirst(4); // [4,5,6,3]
        
        System.out.println(list);
    }
}
