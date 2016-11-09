/*
Given a BST, display all the leaf nodes of the tree.
*/

public void printLeaves(Node root){
    	
	if(root!=null){
		printLeaves(root.leftChild);
		
		printLeaves(root.rightChild);
		root.leftChild=null;
		root.rightChild=null;
		System.out.println(root.age);
	}
}