/*
Given two linked lists, merge them into one.
*/


public Node merge(Node r, Node m){
	Node temp=r;
	
	while(r.next!=null){
		r=r.next;
	}
	r.next=m;
	
	return temp;
}