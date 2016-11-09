		/*
		 * Again, start with the tree.java program and make a tree from characters typed by the user. 
		 * This time, make a complete tree—one that is completely full except possibly on the right 
		 * end of the bottom row. The characters should be ordered from the top down and from left 
		 * to right along each row, as if writing a letter on a pyramid. (This arrangement does not 
		 * correspond to any of the three traversals we discussed in this chapter.) Thus, the string 
		 * ABCDEFGHIJ would be arranged as
				A 
		  B           C 
	   D      E    F      G  
     H   I  J
		 */

public Node sequence(Node root, char alphabet){
		
	Queue<Node> queue = new LinkedList<Node>();
	if(root!=null) queue.offer(root);
	else{
		root = new Node(""+alphabet,1);
		return root;
	}
	while(!queue.isEmpty()){
		if(queue.peek().leftChild != null) queue.offer(queue.peek().leftChild);
		else{
			queue.peek().leftChild = new Node(""+alphabet,1);
			break;
		}
		if(queue.peek().rightChild != null) queue.offer(queue.peek().rightChild);
		else{
			queue.peek().rightChild = new Node(""+alphabet,1);
			break;
		}
		queue.poll();
	}
	return root;
}