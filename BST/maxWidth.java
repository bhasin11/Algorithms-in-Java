/*
Given a BST, find max width of the tree. max wodth is the longest link of nodes in the tree.
*/

public int maxWidth(Node root){
		
	int height=0, h1=0, h2=0, max1=0, max2=0;
	
	if(root!=null){
		if(root.leftChild!=null) h1 = maxWidth(root.leftChild)+1;
		if(root.rightChild!=null) h2= maxWidth(root.rightChild)+1;
		
		max1 = max1 > h1 ? max1 : h1;
		max2 = max2 > h2 ? max2 : h2;
		
		height = height > (max1+max2) ? height : (max1+max2);
	}
	return height;
}