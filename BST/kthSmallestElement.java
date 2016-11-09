/*
Given a BST, find the kth smallest element in the tree.
*/

public void kthSmallestElement(Node root, int k){
	
	if(root!=null && countSmall <= k){
		kthSmallestElement(root.leftChild, k);
		countSmall++;
		if(k == countSmall) System.out.println("kth smalest elemet is "+root.age);
		kthSmallestElement(root.rightChild, k);
	}
}