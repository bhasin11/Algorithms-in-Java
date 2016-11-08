/*
Insert a new node to a linked list
*/

class practiceLinkedList{

	public Node insert(Node head, Node newLink){
		// always inserts at first
		if(head==null) return newLink;
		newLink.next=head;
		head=newLink;
		
		return head;
	}
	
	public void insertAt(Node head, Node newLink, int position){

		if(head==null) return newLink;

		Node current=head, previous=head;
		
		while(position>1){
			previous=current;
			current=current.next;
			position--;
		}
		newLink.next=current;
		previous.next=newLink;
	}
}