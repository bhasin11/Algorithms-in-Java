/*
Given a BST as preorder in an array, verify if it is BST or not.
*/

public boolean verifyLevelorder(int[] preorder){
    	
	if(preorder == null || preorder.length==0) return true;
	
	for( int i=0;i<preorder.length;i++){
		if( preorder.length>((2*i)+1) ){
			if( preorder[i]<preorder[(2*i)+1])	return false;
		}
		
		if( preorder.length>((2*i)+2) ){
			if( preorder[i]>preorder[(2*i)+2])	return false;
		}    		
	}
	return true;
}