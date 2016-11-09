/*
Given a BST, print height of different paths.
*/

public Vector heightOfDifferentPaths(Node root, int sum){
		
	if(root.leftChild!=null || root.rightChild!=null){
		if(root.leftChild!=null) heightOfDifferentPaths(root.leftChild, sum+1);
		if(root.rightChild!=null) heightOfDifferentPaths(root.rightChild, sum+1);
	}
	else arr.addElement(sum);
	
	return arr;
}