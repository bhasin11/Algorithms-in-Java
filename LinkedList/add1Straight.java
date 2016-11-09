/*
Given a linked list with each node as digit, such that 7 -> 6 -> 1 is 167, add 1 and return the new linked list
*/

public Node add1(Node head){

	Node current=head, previous=null;
	int sum=1, carry=0;
	
	while(current!=null){
		System.out.println("a");
		
		sum = sum+carry + current.age;
		System.out.println("sum is "+sum);
		if(sum>9) carry = 1;
		else carry = 0;
		
		sum=sum%10;
		current.age=sum;
		previous=current;
		current=current.next;
		sum=0;
	}
	
	if(carry==1){
		Node newLink = new Node("new", 1);
		previous.next=newLink;
	}
	
	return head;
}