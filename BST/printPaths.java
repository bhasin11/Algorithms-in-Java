/*
Given a BST, print all paths of the tree to all leaf nodes.
*/

public void printPaths(Node root){
		
	formPrint(root, 0);
}

public void formPrint(Node root, int len){
	if(root==null) return;
	array[len++] = root.age;
	
	if(root.leftChild==null && root.rightChild==null)
		printPath(len);
	else{
		formPrint(root.leftChild, len);
		formPrint(root.rightChild, len);
	}
	
}

public void printPath(int len){
	System.out.println();
	for( int i=0;i<len;i++)	System.out.print(array[i]+" ");
