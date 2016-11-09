/*
Given a BST, print its nodes in post order.
*/

public void printPostOrder(Node root){
		
	if(root!=null){
		printPostOrder(root.leftChild);
		printPostOrder(root.rightChild);
		System.out.println("element1 "+root.age);
	}
}