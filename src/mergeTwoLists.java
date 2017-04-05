/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        /*
         * The approach is to compare head value of both lists.
         * The smaller head will become the next element in the 
         * list. We can then put this smaller node in the linked
         * list, and recursively call our function with the rest 
         * of the lists to proceed.
         */
        
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        ListNode head;
        if(l1.val > l2.val){
            head = l2;
            head.next = mergeTwoLists(l1,l2.next);
        }
        else{
            head = l1;
            head.next = mergeTwoLists(l2,l1.next);
        }
        return head;
    }
}