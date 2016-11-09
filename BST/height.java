/*
Given a BST, find the height of the tree.
*/

public int height(Node root){
		
	int height=0;
	
	if(root!=null){
		int h1=0, h2=0;
		if(root.leftChild != null)	h1=height(root.leftChild)+1;
		
		if(root.rightChild != null)	h2=height(root.rightChild)+1;
		
		height = h1 > h2 ? h1 : h2;
	}
	return height;
}