/*
Given a BST, find a value which is nearest to the target value.
*/

public int nearest(Node root, int target){
    	
	if(root==null) return -1;
	while(true){
		if(root.leftChild==null && root.rightChild==null) return root.age;
		if(root.age == target) return 0;
		if(root.age>target){
			if(root.leftChild==null) return root.age;
			if(root.leftChild.age< target)	
				return (root.age - target)>(target - root.leftChild.age) 
					? root.leftChild.age : root.age - target;
			
				else root=root.leftChild;
		}
		else{
			if(root.rightChild==null) return root.age;
			if(root.rightChild.age>target){
				System.out.println("hi");
				return (target - root.age)<(root.rightChild.age - target) 
					? root.age : root.rightChild.age;
			}
			else	root=root.rightChild;
		}
	}
}