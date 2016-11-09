/*
Given a BST, count number of sub-tres of the BST.
*/

public int countTrees(int numKeys) { 
		
	if (numKeys <=1)     return(1); 

	int sum = 0; 
	int left, right, root;
	
	for (root=1; root<=numKeys; root++) { 
		left = countTrees(root-1); 
		right = countTrees(numKeys - root);
		sum += left*right; 
	}
	return(sum); 
}