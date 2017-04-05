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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        /*
         * The approach is to do a level order traversal from top-to-bottom.
         * So, we will start from the top most layer and add the 'root' to 
         * a queue. We have to store the current size of queue into a variable
         * and only need to traverse a loop equal to this size, as the number  
         * of nodes of current level will be equal to this value. In each
         * iteration, we will add the value of peak of queu to a temporary
         * array list, and also we have to add non-null children of each node
         * to queue, so that we can move to the next level later. Once we have
         * completed all iterations for current level, we can add our temporary
         * list to our result array list, which is list of lists. We continue,
         * above steps until the size of queue become 0.
         */
        
        List<List<Integer>> result = new ArrayList();
        if(root == null) return result;
        
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> inner = new ArrayList();
            
            while(size > 0){
                size--;
                inner.add(queue.peek().val);
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                queue.poll();
            }
            result.add(0, inner);
        }
        return result;
    }
}