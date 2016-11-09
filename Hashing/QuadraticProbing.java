public class QuadraticProbing {

	DataItem[] hashArray = new DataItem[100];
	
	public void insert(DataItem data){
		
		int index = HashFunction(data.get());
		int i=0;
		while(hashArray[index] != null && hashArray[index].get() != -1){
			index= (i*i) + index;
			index = index%hashArray.length;
			i++;
		}
		hashArray[index] = data;
	}
	
	public int HashFunction(int key){
		return key%hashArray.length;
	}
	
	public void display(){
		for(int i=0;i<hashArray.length;i++){
			if(hashArray[i] != null){
				System.out.println("element "+hashArray[i].get()+" and key "+i);
			}
		}
	}
}
