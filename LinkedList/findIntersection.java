/*

Given two linked lists, having two heads, merge into one. Find the intersection point(Node).



if we have to only find if the lists intersect or not we can compare the
last nodes of both the lists and if equal (reference) then return true else false

*/

public Node findIntersection(Node r, Node m){
		
	if(r == null || m == null) return null;
    
    Node a = r;
    Node b = m;
    
    while( a != b){
    	a = a == null? m : a.next;
        b = b == null? r : b.next;    
        
    }
    
    return a;
}

/* solution 2
	// there is another solution that assumes that lists are of different length
	// and that the extra length of the longer list won't have the intersecting link
	// so here we move the extra links in the longer list initially and then compare
	// each element of both lists, if equal ever return node
	
public Node findIntersection(Node r, Node m){
		
	int lengthA=0, lengthB=0;
	Node temp=r;
	while(temp != null){
		lengthA++;
		temp=temp.next;
	}
	
	temp=m;
	while(temp != null){
		lengthB++;
		temp=temp.next;
	}
	
	while(lengthA > lengthB){
		lengthA--;
		r=r.next;
	}
	
	while(lengthA < lengthB){
		lengthB--;
		m=m.next;
	}
	
	while(r!=null && r != m){
		r=r.next;
		m=m.next;
	}
	return r;
}
	*/