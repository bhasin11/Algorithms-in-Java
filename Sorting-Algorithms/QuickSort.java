public class QuickSort {

	/*
	 * in each iteration we make the last element as pivot and move pivot to such a 
	 * position that all elements to its left are lesser than pivot and on the right 
	 * side are higher than pivot. so for each iteration we make the pivot reach a 
	 * position which will be its final position in the sorted array
	 * best case: when the array is already sorted. comparisons: O(nlogn), swaps: 0
	 * average case: when pivot ends up at half point in each iteration
	 * comparisons: O(nlogn) and swaps: O(nlogn)
	 * worst case: when the pivot is always largest or smallest of all
	 * comparisons: O(n square), swaps: O(n square)
	 * adv: it is the fastest among basic algorithms
	 * dis: its worst case again takes n square order
	 */
	int input[], len=0;
	
	public void quicksort(int[] arr, int start, int end){
		input=arr;
		if(start<end){
			System.out.println("hi");
			int part = partition(arr, start, end);
			quicksort(arr, start, part-1);
			quicksort(arr, part+1, end);
		}
	}

	public int partition(int arr[], int start, int end){
		
		int temp=0, index=start, pivot=arr[end];
		
		for(int i=start;i<arr.length-1;i++){
			if(pivot >= arr[i]){
				temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				index++;
			}
		}
		
		temp=arr[end];
		arr[end]=arr[index];
		arr[index]=temp;
		return index;
	}

	public int[] display(){
		return input;
	}
}