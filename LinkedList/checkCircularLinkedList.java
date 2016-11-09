/*
Given a linked list find if the list is circular or not. 
Return the value of the node where loop begins else return null
*/
public Node checkLoop(Node head){
		
	Node fast=head, slow=head;
	
	while(fast != null && fast.next!=null){
		fast=fast.next.next;
		slow=slow.next;
		
		if(fast==slow) break;
	}
	
	if(fast== null || fast.next == null) return null;
	
	fast=head;
	
	while(fast != slow){
		fast=fast.next;
		slow=slow.next;
	}
	return fast;
}

/*
	 // to check if loop is present or not, using hash map
	  
	Node fast = r;
	HashMap<Node, Integer> hm = new HashMap<Node, Integer>();
	while(fast!=null){
		if(hm.containsKey(fast)){
			return true;
		}
		else hm.put(fast, 1);
		fast=fast.next;
	}
	
	return false;
 */

/*
	// to check if loop is present or not iteratively
	Node slow=null, fast=r;
	
	while(fast.next != null && fast.next.next != null){
		if(fast == slow)	return true;
		
		fast=fast.next.next;
		if(slow==null) slow=r;
		else slow=slow.next;
	}
	return false;
*/