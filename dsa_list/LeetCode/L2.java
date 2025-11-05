package LeetCode;

public class L2 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(7);
        n1.next = n2;
        n2.next = n3;

        ListNode m1 = new ListNode(5);
        ListNode m2 = new ListNode(6);
        ListNode m3 = new ListNode(4);
        ListNode m4 = new ListNode(9);
        m1.next = m2;
        m2.next = m3;
        m3.next = m4;
        // 2->4->7->0
        // 5->6->4->9
        // -------
        // 7->0->2->0->1

        ListNode l = addTwoNumbers(n1, m1);
        
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        // 0->7->null
        ListNode current = temp;

        int carry = 0;
        while(l1!=null || l2!=null || carry!=0){
            int x = (l1!=null)?l1.val:0;
            int y = (l2!=null)?l2.val:0;
            int sum = x + y + carry;

            current.next = new ListNode(sum%10);
            current = current.next;
            carry = sum/10;

            if(l1!=null)
            l1 = l1.next;
            if(l2!=null)
            l2 = l2.next;
        }

        return temp.next;
    }
    
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
