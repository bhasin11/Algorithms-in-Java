/*
Given a BST, display all the nodes of the tree.
*/


public void display(Node root){
		
	if(root!=null){
		display(root.leftChild);
		display(root);
		display(root.rightChild);
	}
}

public void display(Node temp){
	System.out.println("Name and age is "+name+" "+age):
}