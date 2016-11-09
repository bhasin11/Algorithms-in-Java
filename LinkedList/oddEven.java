/*
Given a linked list return a linked list which has odd positioned elements first and then even positioned 

2 -> 3 -> 4 -> 5 -> 6 -> 7
return: 2 - 4 - 6 - 3 - 5 -7

*/

public Node oddEvenLinkedList(Node r){
	
	if(r==null || r.next == null) return null;
	
	Node odd=r, evenHead = r.next, even=r.next;
	
	while(odd!=null && even != null && even.next!=null){
		odd.next=odd.next.next;
		odd=odd.next;
		even.next=even.next.next;
		even=even.next;
	}
	odd.next=evenHead;
	//even=null;
	
	return r;
}