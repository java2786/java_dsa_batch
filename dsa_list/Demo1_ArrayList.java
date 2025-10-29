import java.util.ArrayList;

public class Demo1_ArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        System.out.println("List: "+list);         // []
        System.out.println("Size: "+list.size());  // 0
        list.add(55);                            // [55]
        list.add(93);                      // [55, 93]
        list.add(1, 15);       // [55, 15, 93]
        System.out.println("List: "+list);     // show
        System.out.println("Size: "+list.size()); // 3
        list.addFirst(5);      // [5, 55, 15, 93]
        System.out.println("List: "+list);
        System.out.println("Size: "+list.size()); // 4
    }
}
/*
List: []
Size: 0
List: [55, 15, 93]
Size: 3
List: [5, 55, 15, 93]
Size: 4
*/