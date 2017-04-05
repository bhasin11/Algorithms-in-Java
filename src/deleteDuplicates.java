/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    
        /*
         * The approach is to check if head is equal to null.
         * Or, head.next is equal to null. In both cases we
         * can't have a duplicate, so we can return without
         * proceeding. Then, we recursively call the
         * deleteDuplicates() method with head.next as 
         * argument. Once, this function call returns, we can
         * check if the current value of head is equal to
         * next value in the list, if true we return head.next
         * else we can return head.
         */
    
        if(head == null || head.next == null) return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
    }
}

/*
    public ListNode deleteDuplicates(ListNode head) {
        
        // Second Approach : Second Approach
        
        if(head == null || head.next == null) return head;
        ListNode temp = head, pre = null;
        
        while(temp != null && temp.next != null){
            if(temp.val == temp.next.val){
                if(pre == null)    head = temp.next;
                else    pre.next = temp.next;
            }
            else    pre = temp;
            
            temp = temp.next;
        }
        return head;
    }
*/
