/*
Given a linked list find the second last element of the list without using two pointers.

*/

public Node secondLast(Node head){
		
	if(head==null || head.next==null) return null;
	
	while(head.next.next!=null) head=head.next;
	
	return head;
}