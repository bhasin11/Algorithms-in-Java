/*
Given a BST, print its nodes in inorder.
*/

public void printInOrder(Node root){
		
	if(root!=null){
		printInOrder(root.leftChild);
		System.out.println("element "+root.age);
		printInOrder(root.rightChild);
	}
}