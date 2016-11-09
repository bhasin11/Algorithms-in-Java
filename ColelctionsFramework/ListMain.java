import java.util.*;


public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[10];
		CollectionInterface ll =  new CollectionInterface();
		//ll.collectionDemo();
		//ll.listDemo();
		//ll.ArrayListDemo(arr);
		ll.HashMapInterface(arr);
		int a=3;
		System.out.println("bit "+(~a));
		int b= ~a;
		
		System.out.println("bit "+(Math.abs(b)));
	}

}
