/*
Given a BST, find the least common ancestor of two given nodes.
*/

public Node findLeastCommonAncestor(Node root, int age1, int age2){
    	
	if(root!=null){
		if(age1 >= root.age && age2 <= root.age) return root;
		
		Node x = findLeastCommonAncestor(root.leftChild,age1,age2);
		if(x!=null) return x;
		Node y = findLeastCommonAncestor(root.rightChild,age1,age2);
		if(y!=null) return y;
	}
	
	return null;
}