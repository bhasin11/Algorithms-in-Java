public class HashTable {

	SeperateChainingLL[] hashArray;// = new SeperateChainingLL[100];
	
	public HashTable(int max){
		hashArray = new SeperateChainingLL[max];
		for(int i=0;i<max;i++){
			hashArray[i] = new SeperateChainingLL();
		}
		
	}
	
	public void insert(Link newLink){

		int index = HashFunction(newLink.get());
		hashArray[index].insert(newLink);
	}
	
	public int HashFunction(int key){
		return (key%hashArray.length);
	}
	
	public void display(){
		for(int i=0;i<hashArray.length;i++){
			if(hashArray[i] != null){
				hashArray[i].display();
			}
		}
	}
}
