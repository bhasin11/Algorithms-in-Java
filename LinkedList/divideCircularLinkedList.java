/*

Given a circular linked list, divide the list into 2 halves.
In the solution below I have first created a circular linked list and have then started the operations.

*/


Node l1= new Node("a",1);
	Node l2= new Node("b",2);
	Node l3= new Node("c",3);
	Node l4= new Node("d",4);
	Node l5= new Node("e",5);
	Node l6= new Node("f",6);
	Node l7= new Node("g",7);
	Node l8 = new Node("h", 8);
	l1.next=l2;
	l2.next=l3;
	l3.next=l4;
	l4.next=l5;
	l5.next=l6;
	l6.next=l7;
	l7.next=l1;
	l8.next=l1;
	
	Node r=l1;
	Node temp=r, mid =null;
	System.out.println("list 1");
	// if r is not null then we can make mid equal to r as if the list has only one 
	// element then mid will be that one element only
	if(r!=null){
		mid=r;
		r=r.next;
		// lets check if the next element is not first element or next to next element
		// is not first element
		while(r.next!=temp && r.next.next!=temp){
			System.out.println("elemet "+mid.age);
			mid=mid.next;
			r=r.next.next;
		}
		System.out.println("elemet "+mid.age);
		
		if(r.next != temp){
			r=r.next;
			mid=mid.next;
			System.out.println("elemet "+mid.age);
		}
		
		System.out.println("list2 ");
		mid=mid.next;
		while(mid != temp){
			System.out.println("elemet "+mid.age);
			mid=mid.next;
		}
	}
}