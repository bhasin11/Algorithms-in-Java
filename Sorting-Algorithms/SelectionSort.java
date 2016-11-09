
public class SelectionSort {

	/*
	 * in selection sort, we put each item in turn and thus sorting the algorithm
	 * so we put the first smallest element first, then we put second smallest element
	 * at second position and so on
	 * we compare the current element with all the remaining elements i.e elements on 
	 * the right side and swap with the smallest one
	 * performance: the algorithm involves comparisons and swaps
	 * number of comparisons in first step is n, then n-1 and so on. so total becomes n*n
	 * worst case: when we have largest element at first position and rest list is ordered
	 * in this case we have to swap n times. so order for comparisons is n*n and for swaps
	 * is O(n)
	 * best case: when we have array in sorted order. but number of comparisons still 
	 * required is O(n*n)
	 * average case: number of comparisons will always be O(n*n) and swaps vary. in average 
	 * case, we have  O(n/2)
	 * so for selection sort order for comparisons and swaps is said to be O(n*n) and O(n)
	 * resp
	 * 
	 * advantage: its advantage is that it takes only O(n) swaps
	 * dis: it never has a scope to end early 
	 */
	
	public int[] selection(int[] arr){
		
		int j=0, index=0, temp=0, temp2=0;
		for(int i=0;i<arr.length;i++){
			temp=arr[i];
			for(j=i+1;j<arr.length;j++){
				if(temp>arr[j]){
					index=j;
					temp=arr[j];
				}
			}
			arr[index]=arr[i];
			arr[i]=temp;
		}
		return arr;
	}
}
