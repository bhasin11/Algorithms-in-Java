/*
Given a linked list, print the elements in reverse order.

*/

public void printReverse(Node head){
		printReverse(head.next);
		displaySingle(head);
}

public void displaySingle(head){
	System.out.println("Name and age are "+name+" "+age);
}