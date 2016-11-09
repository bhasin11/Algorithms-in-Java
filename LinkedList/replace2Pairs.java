/*
Given a linked list, return a new linked list which has each pair of nodes swapped.

given:  a -> b -> c -> d  -> e -> null
return: b -> a -> d -> c -> e -> null
*/


public void replace2pair(Node head){
	
	Node copy=null, current=head, previous=null;
	
	while(current!=null && current.next !=null){
		if(previous==null){
			copy=current;
			current=current.next;
			head=current;
			copy.next=current.next;
			current.next=copy;
			current=current.next;
			previous=current;
			current=current.next;
		}
		else{
			copy=current;
			current=current.next;
			copy.next=current.next;
			current.next=copy;
			previous.next=current;
			current=current.next;
			previous=current;
			current=current.next;
		}
	}
	 return head;
}