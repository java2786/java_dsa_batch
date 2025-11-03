package LeetCode;

public class L206 {
    public static ListNode reverseList(ListNode head) {
        ListNode p = null;
        ListNode s = head;
        while(s!=null){
            ListNode temp = s.next;
            s.next = p;
            p = s;
            s = temp;
        }
        return p;
    }
public static void main(String[] args) {
    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(3);
    ListNode n4 = new ListNode(4);
    ListNode n5 = new ListNode(5);

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
// 1 -> 2 -> 3 -> 4 -> 5 -> null

    System.out.println(n1);

    System.out.println(reverseList(n1));
    
}
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode [val=" + val + ", next=" + next + "]";
    }
    
}
