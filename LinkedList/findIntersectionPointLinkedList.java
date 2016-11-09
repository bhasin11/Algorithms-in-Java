/*
Given two linked lists, having two heads, intersect at a node. Find the intersection point(Node).
*/

public Node intersect(Node r, Node m){
	 // in this solution i have taken the case when 2 lists intersect at a node and 
	 // not necessarily combine at a point and merge into a single list 

	boolean flag=true;
	HashMap<Node, Integer> hm = new HashMap<Node, Integer>();
	
	while(r.next!=null){
		if(hm.containsKey(r)) {
			return r;
		}
		else hm.put(r, 1);
		r=r.next;
		if(flag && r.next==null) { // when r becomes null, point it to m, so same 
			// while can be continued
			r.next=m;
			flag=false;
		}
	}
	return null;
}
*/