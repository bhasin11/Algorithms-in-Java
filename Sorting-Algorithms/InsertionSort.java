public class InsertionSort {

	public void insertionSort(int[] input){
		
		for(int i=1;i<input.length;i++){
			int temp = input[i];
			int j;
			for(j=i-1;j>=0 && input[j] > temp;j--){
				input[j+1]=input[j];
			}
			input[j+1] = temp;
		}
		
		for(int i=0;i<input.length;i++)		System.out.println(input[i]);
	}
}
