
public class linearSearch {

	/*
	 * Linear Search:
	 * Start from the leftmost element and one by one compare x with each element
	 * If x matches with an element, return the index.
	 * If x doesn’t match with any of elements, return -1.
	 * 
	 * Time Complexity: O(n)
	 * Comparisons: n-1
	 */
	
	
	public int linearSearch(int[] arr, int key){
		
		if(arr== null || arr.length==0) return -1;
		
		for(int i=0;i<arr.length;i++)
			if(arr[i] == key) return i;
		
		
		return -1;
	}
}
