/*
Given a tree, check if it is BST or not.
*/

public boolean checkBST(Node root){
	boolean flag = true;
	
	if(root!=null){
		if(root.leftChild!=null){
			if(root.leftChild.age>root.age) return false;
			flag = checkBST(root.leftChild);
			if(!flag) return false;
		}
		if(root.rightChild!=null){
			if(root.rightChild.age<=root.age) return false;
			flag = checkBST(root.rightChild);
			if(!flag) return false;
		}
	}
	return flag;
}