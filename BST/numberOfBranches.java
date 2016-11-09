/*
Given a BST, print number of branches present in the tree.
*/

public int numberOfBranches(Node root){
		
	if(root.leftChild!=null || root.rightChild!=null){
		
		if(root.leftChild!=null)	numberOfBranches(root.leftChild);
		
		if(root.rightChild!=null)	numberOfBranches(root.rightChild);
	}
	else	i++;
	
	return i;
}