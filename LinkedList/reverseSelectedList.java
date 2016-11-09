/*
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
	For example:
	Given 1->2->3->4->5->NULL, m = 2 and n = 4,
	return 1->4->3->2->5->NULL.
 */

public Node reverseSelected(Node r, int init, int fin){
		
	Node temp=null, initial = r, previous=null;
	
	for(int i=0;i<init-1;i++) {
		previous=initial;
		initial=initial.next;
	}
	Node previousNode=previous, currentNode=initial, nextNode=null;
	
	for(int i=0; i<fin-init+1;i++){
		nextNode = currentNode.next;
		
		if(previousNode==previous){
			temp = currentNode;
		}
		else currentNode.next=previousNode;
		
		previousNode=currentNode;
		currentNode=nextNode;
		
	}
	temp.next=currentNode;
	previous.next=previousNode;

	return r;
}

/*
// another solution

Node later=r, initial=r, previous=null;
	while(fin>=0){
		fin--;
		later=later.next;
	}
	
	while(init>1){
		init--;
		previous=initial;
		initial=initial.next;
	}
	
	Node laterNext=later.next;
	Node previousNode=previous, currentNode = initial, nextNode=null; 
	while(currentNode != laterNext){
		nextNode=currentNode.next;
		
		if(previousNode==previous)	currentNode.next=laterNext;
		else currentNode.next=previousNode;
		
		previousNode=currentNode;
		currentNode=nextNode;
	}
	previous.next=previousNode;
	
	return r;
}
*/