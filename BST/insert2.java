		/*
		 * Start with the tree.java program (Listing 8.1) and modify it to 
		 * create a binary tree from a string of letters (like A, B, and 
		 * so on) entered by the user. Each letter will be displayed in 
		 * its own node. Construct the tree so that all the nodes that 
		 * contain letters are leaves. Parent nodes can contain some 
		 * non-letter symbol like +. Make sure that every parent node has 
		 * exactly two children. Don’t worry if the tree is unbalanced. 
		 * Note that this will not be a search tree; there’s no quick
		 *  way to find a given node. You may end up with something 
		 *  like this:
			+
		  +   E 
		+  D
      +  C
     A B 
		 */

public Node insert2(char alphabet){
		
		
	Node newNode = new Node(""+alphabet,0);
	if(root==null) return newNode;
	
	Node newRoot = new Node("+",0);
	newRoot.rightChild=newNode;
	newRoot.leftChild=root;
	
	
	return newRoot;
}