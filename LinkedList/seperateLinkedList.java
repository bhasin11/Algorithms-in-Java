/*
Given a linked list and a value, return a linked list with smaller elements on the left side of the bar and greater or equal to on the right side of the bar element. The relative order of the linked list does not matter.
*/


public void seperateList(Node r, int bar){
	//given a value, make smaller elements of the list on left side of the item
	Node head=r, tail=r;
	
	while(r!=null){
		Node nextNode=r.next;
		
		if(r.age<bar){
			r.next=head;
			head=r;
		}
		else{
			tail.next=r;
			tail=r;
		}
		r=nextNode;
	}
	tail.next=null;
	
	display(head);
}