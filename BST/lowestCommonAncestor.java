/*
Given a BST, find the lowest common ancestor for two given nodes.
*/
public Node lowestCommonAncestor(Node root, Node p, Node q) {
        
    if(root!=null){
		if( (p.age >= root.age && q.age <= root.age) 
				|| (p.age <= root.age && q.age >= root.age) )return root;
		
		Node x = lowestCommonAncestor(root.leftChild,p,q);
		if(x!=null) return x;
		Node y = lowestCommonAncestor(root.rightChild,p,q);
		if(y!=null) return y;
	}
	
	return null;
}