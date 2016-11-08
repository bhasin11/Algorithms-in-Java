public class Node {

	public int age;
	public String name;
	public Node next;
	
	public Node(String name, int age){
		this.age=age;
		this.name=name;
	}
	
	public void display(){
		System.out.println("name and age "+name+" "+age);
	}
}
