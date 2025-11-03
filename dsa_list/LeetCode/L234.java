package LeetCode;

public class L234 {
    
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        // find mid, slow/fast
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse second
        ListNode second = reverseList(slow);
        // compare second half with first half
        ListNode p1 = head;
        ListNode p2 = second;
        boolean flag = true;

        while(p2!=null){
            if(p1.val != p2.val){
                flag = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // reverse second part at last
        reverseList(second);

        return flag;
    }

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
}