/* Recursive function to construct binary of size len from
    Inorder traversal in[] and Preorder traversal pre[].
    Initial values of inStrt and inEnd should be 0 and len -1.  
    The function doesn't do any error checking for cases where 
    inorder and preorder do not form a tree 
*/

public Node buildTree(char in[], char pre[], int inStrt, int inEnd){
    	
        if (inStrt > inEnd)   return null;
  
        Node tNode = new Node(""+pre[preIndex++],0);
  
        if (inStrt == inEnd)   return tNode;
  
        int i=0;
        for (i = inStrt; i <= inEnd; i++)   if (in[i] == pre[preIndex-1]) break;
        
        tNode.leftChild = buildTree(in, pre, inStrt, i - 1);
        tNode.rightChild = buildTree(in, pre, i + 1, inEnd);
  
        return tNode;
    }