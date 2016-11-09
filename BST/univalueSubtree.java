        /*
         * Given a binary tree, count the number of uni-value subtrees.
            A Uni-value subtree means all nodes of the subtree have the same value.
            For example:
            Given binary tree,

              5
             / \
            1   5
           / \   \
          5   5   5
            return 4.
         */

public int univalueSubtree(Node root){
    	
    if(root==null) return 0;
    	
	int[] k=new int[1];
	univalueSubtreeHelper(root,k, root.age);	
	return k[0];
}
    
public boolean univalueSubtreeHelper(Node root,int[] k, int rootValue){
	
	if(root==null) return true;
 	if(root.leftChild==null && root.rightChild==null) {++k[0];return true;}
	
 	boolean lc = univalueSubtreeHelper(root.leftChild,k,root.age);
 	boolean rc = univalueSubtreeHelper(root.rightChild,k,root.age);
	
 	if(lc && rc && root.leftChild!=null && root.rightChild!=null 
			&& root.age == root.leftChild.age 
			&& root.age == root.rightChild.age) {++k[0];return true;}
 	
 	if(lc && root.leftChild!=null && root.age == root.leftChild.age) {++k[0];return true;}
 	
 	if(rc && root.leftChild==null && root.age == root.rightChild.age) {++k[0];return true;}
	
 	return false;
}