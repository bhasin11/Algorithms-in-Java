/*
Given a linked list with each node as digit, such that 7 -> 6 -> 1 is 761, add 1 and return the new linked list
*/

/*
public class StackNode {

	public StackNode next;
	Node num;
	public StackNode(Node num){
		this.num=num;
	}	
}
*/

Node first;
StackNode stackTop =null;

public Node add1(Node head){
	
	Node temp=head;
	int carry=0, sum=1;
	
	while(temp != null){
		stackPush(temp);
		temp=temp.next;
	}
	
	while(stackTop!=null){
		sum = sum + stackTop.num.age + carry;
		if(sum>9) carry =1;
		else carry=0;
		
		sum=sum%10;
		
		stackPop(sum);
		sum=0;
	}
	
	if(carry==1){
		Node xx = new Node("A",1);
		xx.next=head;
		head=xx;
		
	}

	return head;
}

public void stackPush(Node nn){
		StackNode sn = new StackNode(nn);
		sn.next=stackTop;
		stackTop = sn; 
}
	
public void stackPop(int sum){
	stackTop.num.age=sum;
	stackTop=stackTop.next;
}