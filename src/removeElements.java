/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        /*
         * The approach is to iterate through the linked list 
         * and keep track of the previous node. If the current
         * node has value given as input, then we can make
         * remove the current node from the list (By making
         * previous node's next point to current node's next).
         * Finally, we return the head of the modified list.
         */
        
        ListNode previous = null, current = head;
        
        while(current != null){
            if(current.val == val){
                if(previous == null) head = head.next;
                else previous.next = current.next;
            }
            else previous = current;
            current = current.next;
        }
        return head;
    }
}