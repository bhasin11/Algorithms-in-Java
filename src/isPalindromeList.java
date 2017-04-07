/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        
        /*
         * The approach is to find the middle of the given
         * linked list, and at the same time keep reversing
         * first half of the linked list. Once we have found
         * the middle of the list, we can start checking the
         * reversed linked list and second half of the 
         * input linked list node-by-node (val), and if all
         * are equal we can return true, else false.
         */
        
        if(head == null) return true;
        
        ListNode slow = null, fast = head,
                 previousNode = null, 
                 currentNode = head,
                 nextNode = null;
                
        while(fast != null && fast.next != null){
            if(slow == null) slow = head;
            else slow = slow.next;
            fast = fast.next.next;
            
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        if(fast != null) currentNode = currentNode.next;
        
        while(currentNode != null && previousNode != null){
            if(currentNode.val != previousNode.val) return false;
            currentNode = currentNode.next;
            previousNode = previousNode.next;
        }
        return true;
    }
}