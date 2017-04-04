/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        
        /* 
         * The approach is to loop through the linked list and 
         * make the current node points towards its previous
         * node. Ans to continue the loop, we must take the 
         * next value of the current node, so that we can make
         * next node, current node in the given linked list for
         * the next iteration. Once, we iterate through the list
         * we can return the new head of the linked list, which
         * will be the last element/node of the list.
         */
        
        ListNode previousNode=null, nextNode=null, currentNode=head;
        
        while(currentNode != null){
            nextNode=currentNode.next;
            currentNode.next=previousNode;
            previousNode=currentNode;
            currentNode=nextNode;
        }
        return previousNode;
    }
}