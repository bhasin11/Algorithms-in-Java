/*
	 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
		For example,
		Given 1->2->3->3->4->4->5, return 1->2->5.
		Given 1->1->1->2->3, return 2->3.
*/

public Node deleteDuplicates(Node head) {
     
	
	if(head == null || head.next == null) return head;
	
	Node before= new Node("a",33);		// dummy node
	Node xx = before;
	int last=0;
	
	while(head!=null && head.next!=null){

		if(head.age==head.next.age){  //we have 2 nodes with same value
			if(head.next.next != null){ // there is another node after second node
				last=head.age; // making a copy of the last element

				if(head.age == head.next.next.age)	head=head.next; // if third node also has same value, we will remove the first node, sp second and third node have the same value and are still in the list
				
				else	head=head.next.next; // if only two nodes have same value we will remove both of them
			}
			else	break;
		}
		else{ // this means current head has different value than next one so it can be inserted in the new list
			Node copy = new Node("",head.age);
			before.next=copy;
			before=before.next;
			head=head.next;
		}
	}
	if(head!=null){ // to check last element in the list
		if(last!=head.age){
			Node copy = new Node("",head.age);
			before.next=copy;
			before=before.next;
		}
	}
	return xx.next;
}