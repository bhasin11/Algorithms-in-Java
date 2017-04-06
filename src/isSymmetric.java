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
    public boolean isSymmetric(TreeNode root) {
        
        /* 
         * The approach is to make sure 
         *  1. There is no such null node in the tree, whose 
         *     corresponding node is not null.
         *  2. There is no such non-null node in the tree, whose 
         *     corresponding node is null.
         *  3. There is no such node in the tree, whose 
         *     corresponding node doesn't have the same value.
         * Return true if all conditions are true for all nodes
         * of both the trees. Else return false.
         */
         
        if(root == null) return true;
        
        return helper(root.left, root.right);
    }
    
    public boolean helper(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null || left.val != right.val) return false;
        
        return helper(left.left, right.right) && helper(left.right, right.left);
    }
}