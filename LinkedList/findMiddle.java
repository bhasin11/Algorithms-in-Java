/*
Given a linked list, return the middle element of the linked list.
*/

class practiceLinkedList{

	public Node findMiddle(Node head){
		if(head == null) return mid;

		Node mid=head, temp=head;
		
		while(temp.next != null && temp.next.next != null){
			temp = temp.next.next;
			mid = mid.next; 
		}

		return mid;
	}
}