/*
Given a linked list with each node as digit, such that 7 -> 6 -> 1 is 761, add 1 and return the new linked list
*/


public Node add1(Node head){
	
	if(head==null) return null;
	Node lastNotNine=null, temp=head;
	
	while(temp!=null){
		if(temp.age != 9) lastNotNine = temp;
		temp=temp.next;
	}
	
	if(lastNotNine==null){
		temp=head;
		while(temp!=null){
			temp.age=0;
			temp=temp.next;
		}
		Node newLink = new Node("",1);
		newLink.next=head;
		return newLink;
	}
	lastNotNine.age++;
	temp=lastNotNine.next;
	
	while(temp!=null){
		temp.age=0;
		temp=temp.next;
	}
	return head;
}