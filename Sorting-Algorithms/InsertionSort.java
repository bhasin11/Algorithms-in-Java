public class InsertionSort {

	/*
	 * Time Complexity: O(n*n)
	 * Auxiliary Space: O(1)
         * Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted in 
	 * reverse order. And it takes minimum time (Order of n) when elements are already sorted.
	 */
	
	public int[] inserstionSort(int arr[]){
		
		if(arr==null || arr.length==0) return arr;
		
		for(int i=1;i<arr.length;i++){
			System.out.println("Iteration "+i);
			int key = arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j] > key){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			
			for(int k=0;k<arr.length;k++){
				System.out.print(arr[k]+" ");
			}
			
		}
		return arr;
	}
}
