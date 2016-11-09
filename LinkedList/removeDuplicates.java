/*
Given a sorted linked list remove duplicate elements such that only one copy is left for all elements.
given: 1 -> 1 -> 2 -> 3 -> 7 -> 7 -> 7 -> 7 -> null
return: 1 -> 2 -> 3 -> 7 -> null
*/

public void duplicatesRemove(Node head){
		
	Node current = head, previous=null;
	
	while(current != null){
		if(current.age != head.age)	previous=current;
		
		else{
			if(previous==null)	head=current.next;
			
			else	previous.next=current.next;
		}
		current=current.next;
	}

	return head;
}