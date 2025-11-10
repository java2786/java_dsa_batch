import java.util.LinkedList;
import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {

        // LinkedList list = new LinkedList();
        // list.add(43);

        // Generics
        Stack<Integer> stack = new Stack<>();

        // stack.add(null);
        stack.push(23);
        stack.push(12);
        System.out.println(stack);

        int n = stack.pop(); // 12
        int m = stack.peek(); // 23

        System.out.println(stack.size());

        stack.pop();

       

    }
}
