import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // List list = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();
        // FIFO

        q.offer(3); // 3
        q.offer(6); // f6->3r
        q.offer(1); // 1->6->3
        System.out.println(q.poll()); // 1->6
        q.offer(5); // 5->1->6
        q.offer(2); // 2->5->1->6

        System.out.println(q);
        System.out.println(q.size());
    }
}
