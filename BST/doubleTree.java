/*
Given a BST, double all the nodes of the tree.
*/

public Node doubleTree(Node root){
		
	if(root!=null){
		Node newNode= new Node("",root.age);
		Node temp=root.leftChild;
		root.leftChild=newNode;
		newNode.leftChild=temp;
		doubleTree(temp);
		doubleTree(root.rightChild);
	}
	return root;
}