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
    public int findBottomLeftValue(TreeNode root) {
        if(root == null) return 0;
        
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        
        while(!queue.isEmpty()){
            root = queue.poll();
            if(root.right != null)    queue.add(root.right);
            if(root.left != null)     queue.add(root.left);
        }
        return root.val;
    }
}

/*
public int findBottomLeftValue(TreeNode root) {
    
    // Second Approach: Slower
    
    if(root == null) return 0;
    
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
            queue.poll();
        }
    }
    return left;
}
*/