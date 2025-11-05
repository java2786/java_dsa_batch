package LeetCode;

public class L21 {
    
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
    // 7->
    // 4->5->6->
    // 0 -> 1->1->3->
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(0);
        ListNode dummy = temp;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                // add list1 to new list (dummy)
                dummy.next = list1;
                list1 = list1.next;
            } else {
                // add list2 to new list (dummy)
                dummy.next = list2;
                list2 = list2.next;
            }

            dummy = dummy.next;
        }
            if(list1==null){
                dummy.next = list2;
            } 
            if(list2==null) {
                dummy.next = list1;
            }
                    return temp.next;
    }
}