
public class binarySearch {

	/*
	 * Binary Search:
	 * Search by repeatedly diving the array into half.
	 * Begin with an interval covering the whole array
	 * if searched value is greater than middle value of the interval
	   use second half of the array
	 * else use first half of the array
	 *
	 * Time Complexity: O(log n)
	 * Space Complexity: O(1) in iterative implementation
	 * 					 O(log n) in recursive call stack space
	 * 
	 * Comparisons: (log n) + 1
	 */
	
	public int iterativeBinarySearch(int[] arr, int key){
		
		// An iterative approach to Binary Search Algorithm
		
		if(arr == null || arr.length == 0) return -1;
		
		int middle= 0, start=0, end=arr.length-1;
		
		while(start<=end){
			middle= start + (end-start)/2;
			
			if(arr[middle] == key) return middle;
			
			if(arr[middle] > key) end = middle-1;
			
			else start=middle+1;
		}
		return -1;
	}
	
	public int recursiveBinarySearch(int[] arr, int key, int start, int end){
		
		// A recursive approach to Binary Search Algorithm
		
		if(arr == null || arr.length == 0) return -1;
		
		if(end>=0){
			
			int mid = start + (end-start)/2;
			
			if(arr[mid] == key) return mid;
			
			if(arr[mid] > key) return recursiveBinarySearch(arr, key, start, mid-1);

			else return recursiveBinarySearch(arr, key, mid+1, end);
		}
		return -1;
	}
	
	public int optimalBinarySearch(int[] arr, int key, int start, int end){
		
		int middle=0;
		
		while(end-start>1){
			
			middle = start + (end-start)/2;
			
			if(arr[middle] <= key) start=middle;
			else end=middle;
		}
		
		if(arr[start] == key) return start;
		
		return -1;
	}
}