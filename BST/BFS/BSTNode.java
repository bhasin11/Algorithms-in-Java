public class BSTNode {

	int age;
	BSTNode leftChild;
	BSTNode rightChild;
	
	public BSTNode(int age){
		this.age=age;
	}
	
	public void display(){
		System.out.println("age "+age);
	}
}