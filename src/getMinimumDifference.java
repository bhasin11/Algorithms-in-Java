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
    
    Integer pre = null;
    int min = Integer.MAX_VALUE;
    
    public int getMinimumDifference(TreeNode root) {
        
        /*
         * The approach is to do an in-order traversal, and keep track of the minimum difference
         * and the value of the previous node. Since, we are doing an in-oder traversal, the 
         * sequence will be automatically sorted.
         */
        if(root == null) return min;
        
        getMinimumDifference(root.left);
        if(pre != null){
            min = min < root.val - pre ? min : root.val - pre;
        }
        pre = root.val;
        
        getMinimumDifference(root.right);
        
        return min;
    }
}