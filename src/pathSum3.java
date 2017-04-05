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
     * The approach is to store values in a hash map and 
     * check if the current sum of all nodes we have
     * traversed, matches a value in the map such that
     * sum of the two is equal to the target valie. If 
     * possible, we add the value of such a key to a variable
     * and recursively call left and right child of this
     * node, so that we can traverse the whole tree.
     * Finally, each function call returns a count value, which
     * which is added to the return value of the previous call.
     * Finally, sum of all values is returned. 
     */
    
    public int pathSum3(TreeNode root, int sum) {
        HashMap<Integer, Integer> hm = new HashMap();
        
        if(root == null) return 0;
        hm.put(0,1);
        
        return helper(root, sum, 0, hm);
    }
    
    public int helper(TreeNode root, int target, int sum, HashMap<Integer, Integer> hm){
        
        if(root == null) return 0;
        sum += root.val;
        
        int count = hm.getOrDefault(sum - target, 0);
        hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        
        count += helper(root.left, target, sum, hm) + helper(root.right, target, sum, hm);
        
        hm.put(sum, hm.get(sum) - 1);
        
        return count;
    }
}