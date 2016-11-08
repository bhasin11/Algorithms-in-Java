

class practiceLinkedList{

	public Node reverse(Node head){
		
		// solution 1
		
		Node previousNode=null, currentNode=head, nextNode=null;
		
		while(currentNode != null){
			nextNode=currentNode.next;
			currentNode.next=previousNode;
			//System.out.println("age "+currentNode.age);
			previousNode=currentNode;
			currentNode=nextNode;
		}
		
		return previousNode;
		/* solution 2
		 // here all fields are first copied and then moved to a new linked list
		 // similar to push pop in stack 
		Node temp=head;
		while(temp != null){
			Node newNode= new Node();
			newNode.name=temp.name;
			newNode.age=temp.age;
			
			Node.next=revFirst;
			revFirst=Node;
			first=first.next;	
		}
		return revFirst;
		*/
	}
}