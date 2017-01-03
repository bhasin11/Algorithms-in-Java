
public class jumpSearch {

	public int jumpSearch(int[] arr, int key){
		
		/*
		 *  Jump Search is a searching algorithm for sorted arrays. 
		 *  The basic idea is to check fewer elements (than linear search) 
		 *  by jumping ahead by fixed steps or skipping some elements 
		 *  in place of searching all elements.
		 *  For example, suppose we have an array arr[] of size n and block 
		 *  (to be jumped) size m. Then we search at the indexes arr[0], 
		 *  arr[m], arr[2m]…..arr[km] and so on. Once we find the interval 
		 *  (arr[km] < x < arr[(k+1)m]), we perform a linear search operation 
		 *  from the index km to find the element x.
		 *  
		 *  Time Complexity : O(√n)
		 *  Auxiliary Space : O(1)
		 */
		
		if(arr == null || arr.length == 0) return -1;
		
		int previous=0, current=0, step = (int) Math.floor(Math.sqrt(arr.length));
		
		while(current<arr.length){
			System.out.println("1");
			if(arr[current] > key) break;
			previous=current;
			current+=step;
		}
		
		while(previous<arr.length){
			if(arr[previous] == key) return previous;
			previous++;
		}
		
		
		return -1;
	}	
}