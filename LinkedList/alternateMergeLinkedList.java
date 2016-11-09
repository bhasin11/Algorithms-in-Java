/*

Given rwo linked lists merge them into one list such that each list element is placed alternatively in the new linked list.
List 1 : a -> b -> c -> d
List 2 : e -> f -> g -> h

return : a -> e -> b -> f -> c -> g -> d -> h
*/

public Node mergeAlternate(Node r, Node m){
			
	Node r_curr = r, m_curr = m;
	Node r_next=null, m_next=null, p1=null, p2=null;
	
	while(r_curr != null && m_curr != null){
		r_next=r_curr.next;
		m_next=m_curr.next;
		
		m_curr.next=r_curr.next;
		r_curr.next = m_curr;
		
		p1=r_curr;
		p2=m_curr;
		r_curr=r_next;
		m_curr=m_next;
	}		
	if(r_curr==null){
		p2.next=m_curr;
	}
	else p1.next=r_curr;
	
	return r;
}