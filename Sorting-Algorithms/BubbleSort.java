	
public class BubbleSort {

	/*
	 * in bubble sort we compare two consecutive elements and swap them if they are not in
	 * order. so we get the largest element at the end in each pass
	 * number of swaps is more than selection sort but this algorithm may terminate few
	 * iterations earlier than selection sort
	 * best case: when all elements are sorted and we compare through the first pass and 
	 * we are done. no of swaps will be zero and number of comparisons will be n-1
	 * worst case: when the list is in inverted order. so we will have n square comparisons
	 * and n square swaps
	 * average: both comparisons and swaps have n square order
	 * 
	 * so bubble sort performs worse than selection sort in terms of swaps and same in 
	 * terms of comparisons
	 * adv: it can stop early if the list gets sorted
	 * dis: n square comparisons and swaps. so it is least efficient among all algorithms
	 */
	
	public int[] bubble(int arr[]){
		
		int temp=0;
		for(int i=0;i<arr.length;i++){
			boolean flag=true;
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					flag=false;
				}
			}
			if(flag) break;
		} 
		return arr;
	}
}
