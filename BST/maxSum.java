/*
Given a BST, print max sum of a branch.
*/

public int maxSum(Node root, int sum){
		
	if(root.leftChild!=null || root.rightChild!=null){
		if(root.leftChild!=null)	maxSum(root.leftChild, sum+root.age);
		
		if(root.rightChild!=null)	maxSum(root.rightChild, sum+root.age);
	}
	else	max = max > sum+root.age ? max : sum+root.age;
	
	return max;
}