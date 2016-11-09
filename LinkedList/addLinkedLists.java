/*
Given 2 linked lists each representing the digits of a number, add the 2 numbers and return the sum in the
form of a new linked list.

// 7 -> 6 -> 1 : 167
*/

public Node add(Node r, Node m){
		
	int sum=0, carry=0;
	Node dummy= new Node("",1), temp=dummy;

	while(r!=null && m!=null){
		sum=r.age+m.age+carry;

		if(sum>9)	carry=1;
		else carry=0;
		sum=sum%10;
		Node newLink = new Node("",sum);
		temp.next=newLink;
		temp=temp.next;
		r=r.next;
		m=m.next;
	}
	while(r!=null){
		sum=r.age+carry;
		if(sum>9)	carry=1;
		else carry=0;
		sum=sum%10;
		Node newLink = new Node("",sum);
		temp.next=newLink;
		temp=temp.next;
		r=r.next;
	}
	while(m!=null){
			System.out.println("in m if");
		sum=m.age+carry;
		if(sum>9)	carry=1;
		else carry=0;
		sum=sum%10;
		Node newLink = new Node("",sum);
		temp.next=newLink;
		temp=temp.next;
		m=m.next;
	}
	
	// when the sum results in another bit
	if(carry!=0){
		Node newLink = new Node("",carry);
		temp.next=newLink;
		temp=temp.next;
	}
	
	return dummy.next;
}

/*
	//solution 2, here I iterate through each linked list and add digits of each number
	// so I get int value of both numbers. Then I add the values and I again convert each 
	// digit into a Node and return new Linked List
	 

	int num1=0, num2=0, i=0, j=0;
	
	while(r!=null){
		
		j=(int)Math.pow(10,i);
		j=j*r.age;
		num1=num1+j;
		i++;
		r=r.next;
	}
	System.out.println("num is "+num1);
	
	i=j=0;
	while(m!=null){
		j=(int) Math.pow(10, i);
		j=j*m.age;
		num2=num2+j;
		i++;
		m=m.next;
	}

	num1=num1+num2;
	
	int b=0;
	Node a=new Node("", 1), temp=a;
	
	while(num1>0){
		b=num1%10;
		num1=num1/10;
		Node newLink = new Node("",b);
		temp.next=newLink;
		temp=temp.next;
	}
	return a.next;
*/