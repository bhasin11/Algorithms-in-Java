/*
Given a BST, find the kth Largest element in the tree.
*/

public void kthLargestElement(Node root, int k){
		
	if(root!=null && countLarge <= k){
		kthLargestElement(root.rightChild, k);
		countLarge++;
		if(k == countLarge) System.out.println("kth largest elemet is "+root.age);
		kthLargestElement(root.leftChild, k);
	}
}