/*
Given a BST and an age, return true if any node has that value or else false.
*/

public boolean find(Node root, int age){
		
	if(root == null ) return false;
	Node temp=root;
	
	while(temp!=null){
		if(temp.age == age) return true;
		if(temp.age > age) temp=temp.leftChild;
		else temp=temp.rightChild;
		
	}
	
	return false;
}