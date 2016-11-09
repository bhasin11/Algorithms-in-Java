/*
Given a BST, print all nodes that are at value k from the root.
*/

public void printNodesAtK(Node root, int k){
		
	if(root!=null){
		if(k==0) root.display();
		
		else{
			printNodesAtK(root.leftChild,k-1);
			printNodesAtK(root.rightChild,k-1);
		}
	}
	
}