/*
Given a BST, print sum of all different paths in the tree.
*/

public Vector sumOfDifferentPaths(Node root, int sum){
	if(root.leftChild!=null || root.rightChild!=null){
	
		if(root.leftChild!=null)	sumOfDifferentPaths(root.leftChild, sum+root.age);
		
		if(root.rightChild!=null)	sumOfDifferentPaths(root.rightChild, sum+root.age);
	}
	else	arr.addElement(sum+root.age);
	
	return arr;
}