/*
Given a BST, print its nodes in inorder.
*/

public void printInOrderWithoutRecursion(Node root){
		
	if(root==null) return;
	
	Node current=root;
	
	while(current!=null){
		
		if(current.leftChild==null){
			current.display();
			current=current.rightChild;
		}
		else{
			Node pre = current.leftChild;
			
			while(pre!=null && pre.rightChild!=current){
				pre=pre.rightChild;
			}
			
			if(pre==null){
				pre.rightChild=current;
				current=current.leftChild;
			}
			else{
				pre.rightChild=null;
				current.display();
				current=current.rightChild;
			}
		}
	}
	
}