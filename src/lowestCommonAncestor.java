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
    
    /*
     * For a given root 4 cases are possible - 
     *  1. Either the root is null. Which means there 
     *     is no ancestor node, so we return null.
     *  2. Or of the two given values, we have one on
     *     each side of the root, so we can return root.
     *  3. Or both values lie on right side of the 
     *     current root. So, we recursively call our
     *     function with right child of root and the 
     *     two given values.
     *  4. Or both values lie on left side of the 
     *     current root. So, we recursively call our
     *     function with left child of root and the 
     *     two given values.
     */     
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return root;
        if( (p.val >= root.val && q.val <= root.val) || 
            (q.val >= root.val && p.val <= root.val) ) return root;
        
        else if(p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right, p, q);
        else return lowestCommonAncestor(root.left, p, q);
    }
}