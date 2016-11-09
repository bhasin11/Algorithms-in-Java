/*
Given a linked list delete the middle element of the linked list and return the modified linked list.
*/



public Node deleteMiddleItem(Node r){
	Node fast=r, slow=null;
	
	if(r.next == null) return null;

	if(fast != null){
		slow=r;
		while(fast.next != null && fast.next.next!=null){
			fast=fast.next.next;
			slow=slow.next;
		}
	}
	
	slow.age=slow.next.age;
	slow.name=slow.next.name;
	slow.next=slow.next.next;
	
	return r;
}