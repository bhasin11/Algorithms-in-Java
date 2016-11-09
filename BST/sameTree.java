/*
Given two BSTs, find if they are same (have same position of nodes and same values).
*/

public boolean sameTree(Node root1, Node root2){
		
	if(root1==null && root2==null) return true;
	if((root1==null && root2!=null) || (root1!=null && root2==null) || (root1.age!=root2.age) ) return false;
	
	if(!sameTree(root1.leftChild,root2.leftChild)) return false;
	if(!sameTree(root1.rightChild,root2.rightChild)) return false;
	
	return true;
}