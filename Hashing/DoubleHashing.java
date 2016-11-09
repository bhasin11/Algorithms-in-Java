public class DoubleHashing {

	DataItem[] hashArray = new DataItem[10];
	
	public void insert(DataItem data){
		
		int index = HashFunction(data.get());
		int stepSize = 4329 - (index%hashArray.length);
		
		while(hashArray[index] != null && hashArray[index].get() != -1){
			index += stepSize;
			System.out.println("step "+stepSize);
			index %= hashArray.length;
		}
		hashArray[index]=data;
	}
	
	public int HashFunction(int key){
		return key%hashArray.length;
	}
	
	public void display(){
		for(int i=0;i<hashArray.length;i++){
			if(hashArray[i] != null) 
				System.out.println("element "+hashArray[i].get()+" and key "+i);
		}
	}
}
