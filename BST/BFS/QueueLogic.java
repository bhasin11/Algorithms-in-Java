public class QueueLogic {

	QueueNode head=null, tail=null;
	
	public void enque(BSTNode bs){
		QueueNode newNode = new QueueNode(bs);
		if(head==null){
			head=newNode;
			tail=newNode;
		}
		else{
			tail.next=newNode;
			tail=tail.next;
		}
	}
	
	public void deque(){
		if(head==null) head=null;
		else{
			head=head.next;
		}
	}
	
	public BSTNode peek(){
		return head.data;
	}
	
	public boolean isEmpty(){
		return head==null;
	}
	
	public void displayAll(){
		QueueNode temp=head;
		while(temp!=null){
			temp.data.display();
			temp=temp.next;
		}
	}
}