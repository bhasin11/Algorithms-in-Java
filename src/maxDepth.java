/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        /*
    	 * The approach is to check if the root is null or not.
    	 * If null, we will return 0 as there is no depth for this root.
    	 * Else, we will call maxDepth() with 'root.left' and 'root.right'.
    	 * We will save the return values of both the calls.
    	 * Finally, we will compare both the values and will return 
    	 * larger value of the two. We will also add '1' to the result
    	 * before returning, to include the depth of the 'root' element.
    	 */
    	 
    	 if(root == null) return 0;
        
         int h1=0, h2=0;
        
         h1 = maxDepth(root.left);
         h2 = maxDepth(root.right);
        
         return h1>h2 ? h1+1 : h2+1;
    }
}