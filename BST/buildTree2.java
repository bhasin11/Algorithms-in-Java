/*
Given a inorder and postorder of a tree in seperate array, build a BST.
*/

    private static int curr;
    
    public Node buildTree(int[] inorder, int[] postorder) {
    	// from inorder and postorder
        if(inorder == null || postorder == null || inorder.length==0 || postorder.length==0) return null;
        curr = postorder.length-1;
        return helper(inorder, postorder, 0, inorder.length-1);
    }
    
    public Node helper(int[] inorder, int[] postorder, int start, int end){
        Node root = null;
        if(start<=end && curr>=0){
            int i=0;
            //System.out.println(postorder[curr]);
            for(i=start;i<end;i++)    if(inorder[i] == postorder[curr]) break;
        
            root = new Node("",postorder[curr--]);
            //System.out.println(postorder[curr]);
            root.rightChild = helper(inorder,postorder, i+1,end);
            //System.out.println(postorder[curr]);
            root.leftChild = helper(inorder,postorder,0,i-1);
        }
        return root;
    }