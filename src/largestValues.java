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
    public List<Integer> largestValues(TreeNode root) {
        
        /*
         * The approach is to add first occurance of element
         * in a row in a new index of the resulting string.
         * And then, keep comparing if we find any other value
         * in the same row.
         */
        
        List<Integer> result = new ArrayList();
        
        helper(root, result, 0);
        return result;
    }
    
    public void helper(TreeNode root, List<Integer> result, int depth){
        if(root == null) return;
        
        if(depth == result.size()) result.add(root.val);
        
        else    result.set(depth, Math.max(result.get(depth), root.val));

        helper(root.left, result, depth + 1);
        helper(root.right, result, depth + 1);
    }
}

/*
public List<Integer> largestValues(TreeNode root) {

    // Seocnd Approach: Slower
    List<Integer> result = new ArrayList();
    
    if(root == null) return result;

    int left = 0, size = 0;
    Queue<TreeNode> queue = new LinkedList();
    queue.offer(root);
    
    while(!queue.isEmpty()){
        left = queue.peek().val;
        size = queue.size();
        
        while(size > 0){
            size--;
            if(queue.peek().left != null) queue.offer(queue.peek().left);
            if(queue.peek().right != null) queue.offer(queue.peek().right);
            
            left = left > queue.peek().val ? left: queue.peek().val;
            queue.poll();
        }
        result.add(left);
    }
    return result;
}


*/