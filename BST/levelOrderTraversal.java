/*
Given a BST, print its nodes in level order.
*/

public void levelOrder(Node root){
		
	Queue<Node> queue = new LinkedList<Node>();
	if(root!=null) queue.offer(root);
	
	while(!queue.isEmpty()){
		if(queue.peek().leftChild != null) queue.offer(queue.peek().leftChild);
		if(queue.peek().rightChild != null) queue.offer(queue.peek().rightChild);
		
		System.out.println("value "+queue.peek().age);
		
		queue.poll();
	}
	
}