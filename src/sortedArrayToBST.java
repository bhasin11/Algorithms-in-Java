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
    public TreeNode sortedArrayToBST(int[] nums) {
        
        /* 
         * The apprach is to divide array in half and 
         * then make the middle element of the array as
         * root. Then, do the same for left and right
         * parts of the array from middle. Make these 
         * parts left and right child of the current
         * root. Repeat the process uptil we reach a
         * single element. Finally, return the root.
         */
        
        if(nums==null || nums.length==0) return null;
        
        return helper(nums, 0, nums.length-1);
    }
    
    public TreeNode helper(int[] nums, int start, int end){
        
        if(start>end) return null;
        
        int middle = (start + end)/2;
        TreeNode root = new TreeNode(nums[middle]);
        
        root.left = helper(nums, start, middle-1);
        root.right = helper(nums, middle+1, end);
        
        return root;
    }
}