/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void deleteNode(ListNode node) {
        
        /*
         * The approach is to move the value of next node
         * into the current node and remove the next node.
         * Since, it is mentioned in the problem statement
         * that given node won't be the last node i.e, 
         * tial of the list, we don't have to worry about
         * checking next node.
         */
        
        if(node == null) return;
        
        if(node.next != null){
            node.val = node.next.val;
            node.next=node.next.next;
        }
    }
}