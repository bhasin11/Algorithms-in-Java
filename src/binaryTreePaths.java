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
    public List<String> binaryTreePaths(TreeNode root) {

        /*
         * The approach is to keep appending the values of a 
         * node to a string, and call the helper function 
         * recursively. Once we find a leaf node, which doesn't 
         * have both left and right childs, add this string to 
         * the array. Finally, we can return the array which
         * will have strings representing all the fields.
         */
        List<String> list = new ArrayList<String>();
        
        if(root == null) return list;
        
        helper(root, ""+root.val, list);
        
        return list;
    }
    
    public void helper(TreeNode root, String str, List<String> list){
        if(root.left == null && root.right == null)    list.add(str);
        
        if(root.left != null) helper(root.left, str+"->"+root.left.val, list);
        if(root.right != null) helper(root.right, str+"->"+root.right.val, list);
    }
}