/*
Given a BST, find the maximum root.
*/

public Node findMaximum(Node root){
		
	if(root==null) return null;
	
	Node current=root;
	
	while(current.rightChild!=null){
		current=current.rightChild;
	}
	return current;
}