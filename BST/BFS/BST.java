public class BST {

	BSTNode root=null;
	
	public BSTNode insertBST(int age){
		// inserting through bfs
		BSTNode newAlphabet = new BSTNode(age);
		if(root==null) root = newAlphabet;
		else{
			BSTNode temp=root;
			QueueLogic ql = new QueueLogic();
			
			ql.enque(temp);
			while(!ql.isEmpty()){
				temp = ql.peek();
				if(temp.leftChild != null)	ql.enque(temp.leftChild);
				else{
					temp.leftChild=newAlphabet;
					break;
				}
				if(temp.rightChild != null) ql.enque(temp.rightChild);
				else{
					temp.rightChild=newAlphabet;
					break;
				}
				ql.deque();
			}
		}
		return root;
	}
	
	public BSTNode insert(int age){
		
		BSTNode newAlphabet = new BSTNode(age);
		if(root==null) root = newAlphabet;
		else{
			BSTNode current= root;
			while(true){
				if(current.age < age){
					if(current.rightChild==null){
						current.rightChild=newAlphabet;
						break;
					}
					else current=current.rightChild;
				}
				else{
					if(current.leftChild==null){
						current.leftChild=newAlphabet;
						break;
					}
					else current=current.leftChild;
				}
			}
		}
		return root;
	}
	
	public void display(BSTNode root){
		BSTNode temp=root;
		QueueLogic ql = new QueueLogic();
		if(temp!=null){
		
			ql.enque(temp);
			while(!ql.isEmpty()){
				temp = ql.peek();
				temp.display();
				if(temp.leftChild != null)	ql.enque(temp.leftChild);
				if(temp.rightChild != null) ql.enque(temp.rightChild);
				ql.deque();
			}
		}
	}
}