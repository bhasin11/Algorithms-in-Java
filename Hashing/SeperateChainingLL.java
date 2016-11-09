
public class SeperateChainingLL {

	Link first;
	
	public void insert(Link newLink){
		
		Link previous=null, current =first;
		
		if(first==null){
			first=newLink;
		}
		else{
			newLink.next=first;
			first=newLink;
		}	
	}
	
	public void display(){
	
		Link current=first;
		int i=1;
		while(current!=null){
			System.out.println("value: "+current.get()+" position "+i);
			//current.display();
			i++;
			current=current.next;
		}	
	}
}