/*
Given a inorder and preorder of a tree in seperate array, build a BST.
*/

public static int current =0; // preorder 1 3 // inorder 3 1
    public Node buildTree2(int[] preorder, int[] inorder) {
        if(preorder==null || inorder==null || preorder.length==0 || inorder.length==0) return null;
        
        return helper2(preorder, inorder, 0, preorder.length-1);
    }
    
    public Node helper2(int[] preorder, int[] inorder, int start, int end){
        Node root=null;
        if(start<=end && current<=inorder.length-1){
            root = new Node("",preorder[current]);
            int i=0;
            for(i=start;i<=end;i++) if(preorder[current] == inorder[i]) break;
            current++;
            
            root.leftChild = helper(preorder, inorder, start,i-1);
            root.rightChild = helper(preorder, inorder, i+1, end);
        }
        
        return root;
    }