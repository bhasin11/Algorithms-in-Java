/*
Given a BST, find the minimum root.
*/

public Node findMinimum(Node root){
		
	if(root==null) return null;
	
	Node current=root;
	while(current.leftChild!=null){
		current=current.leftChild;
	}
	return current;
}