/*
Given a BST, print its nodes in pre order.
*/

public void printPreOrder(Node root){
		
	if(root!=null){
		System.out.println("element1 "+root.age);
		printPostOrder(root.leftChild);
		printPostOrder(root.rightChild);
	}
}