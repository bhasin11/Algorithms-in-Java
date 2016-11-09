/*
Insert node in a BST.
*/

public Node insert(Node root, int age){
	
	Node newNode = new Node("a",age);
	
	if(root==null){
		root= newNode;
		return root;
	}
	Node current = root;
	while(true){
		if(newNode.age >= current.age){
			if(current.rightChild == null){
				current.rightChild=newNode;
				break;
			}
			else current=current.rightChild;
		}
		else{
			if(current.leftChild == null){
				current.leftChild=newNode;
				break;
			}
			else current=current.leftChild;
		}
	}
	return root;
}