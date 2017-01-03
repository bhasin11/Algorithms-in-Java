
public class MergeSort {

	/*
	 * Merge Sort is a Divide and Conquer algorithm. It divides input array in two halves, 
	 * calls itself for the two halves and then merges the two sorted halves. The merge() 
	 * function is used for merging two halves. The merge(arr, l, m, r) is key process 
	 * that assumes that arr[l..m] and arr[m+1..r] are sorted and merges the two sorted 
	 * sub-arrays into one. 
	 * 
	 * 
	   MergeSort(arr[], l,  r)

		 If r > l
	     1. Find the middle point to divide the array into two halves:  
	             middle m = (l+r)/2
	     2. Call mergeSort for first half:   
	             Call mergeSort(arr, l, m)
	     3. Call mergeSort for second half:
	             Call mergeSort(arr, m+1, r)
	     4. Merge the two halves sorted in step 2 and 3:
	             Call merge(arr, l, m, r)
	             
	  * Time complexity of Merge Sort is \Theta(nLogn) in all 3 cases 
	  * (worst, average and best) as merge sort always divides the array 
	  * in two halves and take linear time to merge two halves.         
	  */
	
	public int[] mergeSort(int arr[]){
		
		if(arr==null || arr.length==0) return arr;
		helper(arr, 0, arr.length-1);
		
		return arr;
	}
	
	public void merge(int[] arr, int start, int middle, int end){
		
		int a = middle-start+1;
		int b = end-middle;
		
		int[] r1 = new int[a];
		int[] r2 = new int[b];
		
		for(int i=0;i<a;i++){
			r1[i] = arr[start + i];
		}

		for(int i=0;i<b;i++){
			r2[i] = arr[middle + i + 1];
		}
		int j=0, k=0, l=start;

		while(j<a && k<b){
			
			if(r1[j] > r2[k]){
				arr[l] = r2[k];
				k++;
			}
			else{
				arr[l] = r1[j];
				j++;
			}
			l++;
		}

		while(j<a){
			arr[l] = r1[j];
			j++;
			l++;
		}
		
		while(k<b){
			arr[l] = r2[k];
			k++;
			l++;
		}
		
	}
	
	public int[] helper(int[] arr, int start, int end){
		
		if(start<end){
			int middle = start + (end-start)/2;
			
			helper(arr, start, middle);
			helper(arr, middle+1, end);
			
			merge(arr, start, middle, end);
		}
		
		return arr;
	}
}
