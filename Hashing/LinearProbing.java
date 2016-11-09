
public class LinearProbing {

	DataItem[] hashArray = new DataItem[5];
	
	public void insert(DataItem dm){
		// get hash value which will become index in the array. check is it is already 
		// occupied, if yes increment until -1 or blank space is found. and then insert
		// if array is completely filled while wont stop so compare number of iterations 
		// with array length and break while if it becomes equal ever
		
		int index = HashFunction(dm.get());
		int counter=0;
		boolean flag=true;
		
		while(hashArray[index] != null && hashArray[index].get() != -1){
			index++;
			index=index%hashArray.length;
			if(counter++ == hashArray.length) flag =false; 
			// in case array is full, while wont terminate
		}
		if(flag) hashArray[index]=dm;
		else System.out.println("not inserted, array full");
	}
	
	public void delete(DataItem dl){
		// get hash value of the data. find it and delete
		int index = HashFunction(dl.get());
		
		while(hashArray[index] != null){
			if(hashArray[index].get() == dl.get()){
				hashArray[index] = null;
				System.out.println("deleted");
				break;
			}
			index++;
			index=index%hashArray.length;
		}
	}
	
	public void find(DataItem dfind){
		int index = HashFunction(dfind.get());
		System.out.println("in find");
		while(hashArray[index] != null){
			System.out.println("in while");
			if(hashArray[index].get() == dfind.get()) System.out.println("found");
			
			index++;
			index=index%hashArray.length;
		}
	}
	
	public int HashFunction(int key){
		return key%(hashArray.length);
	}
	
	public void displayAll(){
		for(int i=0;i<hashArray.length;i++){
			if(hashArray[i] != null)
				System.out.println("element "+hashArray[i].get()+" and key "+i);
		}
	}
}
