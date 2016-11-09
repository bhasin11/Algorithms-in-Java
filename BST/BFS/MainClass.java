public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BST bst = new BST();
		BSTNode root = bst.insert(10);
		root = bst.insertBST(8);
		root = bst.insertBST(5);
		root = bst.insertBST(9);
		root = bst.insertBST(12);
		root = bst.insertBST(14);
		root = bst.insertBST(4);
		
		System.out.println("before BFS");
		
		bst.display(root);
	}
}