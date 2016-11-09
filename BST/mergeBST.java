/*
Given 2 BSTs, merge them. I have altered the original trees here.
*/

public Node mergeTwoBST(Node root1, Node root2){
    	
	if(root2!=null){

		mergeTwoBST(root1,root2.leftChild);
		root2.leftChild=null;
		mergeTwoBST(root1,root2.rightChild);
		root2.rightChild=null;
		root1 = insertAgain(root1,root2);
	}
	return root1;
}

public Node insertAgain(Node root, Node newNode){
		
	Node current=root;
	while(true){
		if(current.age>newNode.age){
			if(current.leftChild==null){
				current.leftChild=newNode;
				break;
			}
			else current=current.leftChild;
		}
		else{
			if(current.rightChild==null){
				current.rightChild=newNode;
				break;
			}
			else current=current.rightChild;
		}
	}
	return root;
}