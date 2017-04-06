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
    public boolean isBalanced(TreeNode root) {
        
        /*
         * The approach is to compare depths of left and 
         * right side of the current root. To do so, we
         * recursively call left and right childs of each
         * node and get respective heights. We then compare
         * both the heights, and if their difference is
         * more than 1, we return -1. Even for a single
         * case if we receive -1, we will return false.
         */
        
        if(root == null) return true;
        
        return helper(root) != -1;
    }
    
    public int helper(TreeNode root){
        if(root==null) return 0;
        
        int h1 = helper(root.left);
        if(h1 == -1) return -1;
        
        int h2 = helper(root.right);
        
        if(h2 == -1 || Math.abs(h1-h2) > 1) return -1;

        return h1 > h2 ? h1 + 1 : h2 + 1;
    }
}