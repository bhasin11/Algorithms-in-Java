/*
Given a linked list, display a single element in the linked list or all the elements.
*/

class practiceLinkedList{

	public void display(Node head){

		Node temp=head;
		
		while(temp != null){
			//temp.display();
			System.out.println("Name and age is "+temp.name+" "+temp.age);
			temp=temp.next;
		}
	}

	public void display(Node node){
		if(node != null) node.display();
	}
}