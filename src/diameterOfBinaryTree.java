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
    
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        /*
         * The appraoch is to maintain a global variable 'max' and
         * recursively call all nodes of the goven tree. For each,
         * call check if the sum of maximum length of left and 
         * maximum length of right is greater than max, if yes, 
         * replace max with their sum. We also return greater length
         * of left and right, so that parent of current root can 
         * compare.
         */
        
        helper(root);
        
        return max;
    }
    
    public int helper(TreeNode root){
        if(root == null) return 0;
        
        int a = helper(root.left);
        int b = helper(root.right);
        max = max > a+b ? max : a+b;
        a = a > b ? a : b;
        
        return a+1;
    }
}