/*
Given a linked list return a linked list in which all elements are reversed in a group of three.
*/

public Node reverseIn3(Node head){
		
	Node temp=head, dummy=null;
	Node previous = null, previousNode=null, currentNode=temp, nextNode=null;
	int i=2;
	while(temp!=null && temp.next!=null && temp.next.next!=null){
		currentNode=temp;
		while(i>=0){
			nextNode = currentNode.next;
			if(previous==null) {
				dummy = currentNode;
				previous = new Node("",1);
			}
			currentNode.next = previousNode;
			previousNode=currentNode;
			currentNode=nextNode;
			
			i--;
		}
		head = temp.next.next;
		temp=temp.next.next.next;
		previousNode=dummy;
		i=2;
	}
	return head;
}