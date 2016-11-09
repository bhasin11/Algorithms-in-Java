/*

Given two sorted linked lists, merge them into a sorted list.

*/

public Node sortedMerge(Node r, Node m){
		
	Node dummy = new Node("dummy",1);
	Node temp=dummy;
	
	while(r != null && m!=null){
		if(r.age > m.age){
			temp.next=m;
			m=m.next;
			temp=temp.next;
		}
		else{
			temp.next=r;
			r=r.next;
			temp=temp.next;
		}
	}
	
	while(r!=null){
		temp.next=r;
		r=r.next;
		temp=temp.next;
	}
	while(m!=null){
		temp.next=m;
		m=m.next;
		temp=temp.next;
	}
	return dummy.next;
}