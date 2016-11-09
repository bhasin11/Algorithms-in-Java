/*
Given a linked list and an int value, find the node at that position from end in the linked list
*/

public Node fromEnd(Node head, int position){
	
	Node ahead=head, behind=head;
	
	while(position-->0)	ahead=ahead.next;
	
	while(ahead!=null){
		behind=behind.next;
		ahead=ahead.next;
	}
	return behind;
}