/*
Given a BST, return mirror of the tree.
*/

public Node mirror(Node root){
		
		if(root!=null){
			Node temp = root.rightChild;
			root.rightChild = mirror(root.leftChild);
			root.leftChild=mirror(temp);
		}
		return root;
	}