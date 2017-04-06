/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        /*
         * The approach is to use two pointers and move them
         * at different speeds. If the two meet ever, we can
         * return true, as there is no end to the given linked
         * list. But, if the faster pointer reaches end of list,
         * then there is no cycle in the list and we can return
         * false.
         */
        
        if(head == null || head.next == null) return false;
        
        ListNode fast = head.next, slow = head;

        while(fast != null && fast.next != null){
            if(fast == slow) return true;
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}