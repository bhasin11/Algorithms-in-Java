/*
Given a BST, return a tree that is upside down of the given tree.
*/

public Node upsideDown(Node root){

	if (root == null)  return null;  
    //Node left = root.leftChild;  
    if (root.leftChild != null) {  
        Node left = upsideDown(root.leftChild);  
        left.leftChild = root.rightChild;
        root.leftChild=null;
        root.rightChild=null;
        left.rightChild = root;  
        return left;  
    }  
    return root;  
}