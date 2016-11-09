public class QueueNode {

	BSTNode data;
	QueueNode next;
	
	public QueueNode(BSTNode newNode){
		data=newNode;
	}
	
	public BSTNode get(){
		return data;
	}
}