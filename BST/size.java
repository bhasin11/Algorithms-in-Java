/*
Given a BST, find the number of node in the tree.
*/
public int size(Node root){
		
	if(root!=null){
		size(root.leftChild);
		size++;
		size(root.rightChild);
	}
	return size;
}