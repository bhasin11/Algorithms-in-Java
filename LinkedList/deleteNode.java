/*
Given a linked list, delete a node by value or position
*/

class practiceLinkedList{

	public Node deleteAt(Node head, int position){

		if(head==null) return null;

		Node current=head, previous=null;
		
		while(position>1 && current != null){
			previous=current;
			current=current.next;
			position--;
		}
		if(position != 1) return head; // list length smaller than position to be deleted
		previous.next=current.next; // delete element

		return head;
	}

	public Node deleteNode(Node head, Node del){

		if(head==null) return null;

		Node current=head, previous=null;
		
		while(current != del && current != null){
			previous=current;
			current=current.next;
			position--;
		}
		if(previous == null) return head.next; // in case del is head
		if(current != null) previous.next=current.next; // delete element if found

		return head;
	}
}
