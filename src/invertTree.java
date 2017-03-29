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
    public TreeNode invertTree(TreeNode root) {
        /*
         * The approach is to recursively call the 'invertTree'
         * function and invert the left and right child of the 
         * current root. Finally, return the root.
         */
         
         if(root == null) return null;
        
         TreeNode temp = invertTree(root.left);
         root.left = invertTree(root.right);
         root.right=temp;
        
         return root;
    }
}