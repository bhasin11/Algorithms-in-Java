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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        /* 
         * The approach is to return true if both current 
         * nodes are null or both have the same value. We
         * recursively call left and right children of 
         * both the nodes, and check if the above consitions
         * are valid in all the sub-trees.
         */
        
        if(p==null && q==null) return true;
        if( (p==null && q!=null) || (p!=null && q==null)) return false;
        
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}