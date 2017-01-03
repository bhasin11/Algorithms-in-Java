
public class interpolationSearch {

	
	public int interpolationSearch(int arr[], int n, int x){
	    
		/*
		 * Algorithm
		 * Rest of the Interpolation algorithm is same except the above partition logic.
		 * 
		 * Step1: In a loop, calculate the value of “pos” using the probe position formula.
		 * Step2: If it is a match, return the index of the item, and exit.
		 * Step3: If the item is less than arr[pos], calculate the probe position of the left 
		 * sub-array. Otherwise calculate the same in the right sub-array.
		 * Step4: Repeat until a match is found or the sub-array reduces to zero.
		 * 
		 * Time Complexity : If elements are uniformly distributed, then O (log log n)). 
		 * In worst case it can take upto O(n).
		 * Auxiliary Space : O(1)
		 */
		
		int lo = 0, hi = (n - 1);
	 
	    while (lo <= hi && x >= arr[lo] && x <= arr[hi]){
	        
	        int pos = lo + (((hi-lo) /(arr[hi]-arr[lo]))*(x - arr[lo]));
	 
	        if (arr[pos] == x)
	            return pos;
	 
	        if (arr[pos] < x)
	            lo = pos + 1;
	 
	        else
	            hi = pos - 1;
	    }
	    return -1;
	}
}
