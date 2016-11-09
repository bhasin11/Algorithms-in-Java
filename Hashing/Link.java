public class Link {

	public Link next;
	private int age;
	
	public Link(int age){
		this.age=age;
	}
	
	public int get(){
		return age;
	}
	
	public void display(){
		System.out.println("age is "+age);
	}
}
