
public class MergeSort {

	/*
	 * it divides the given array in halves until single elements are left. once single elements
	 * are found it compares them with other single elements and then create a small sorted array. 
	 * as the merging proceeds arrays elements are compared with each other and one at a time
	 * and are sorted together
	 * 
	 * performance: number of comparisons and swaps are O(n logn) 
	 * merge sort seems to be faster than quicksort but in practice both are same
	 * adv: equally fast as quicksort
	 * dis: copying elements from temporary array slows the process
	 */
	
	int[] input;
	public void divide(int[] arr, int begin, int end){
		
		input=arr;
		if(begin<end){
			int middle = (begin + end)/2;
			
			divide(arr, begin,middle);
			divide(arr, middle+1,end);
			merge(arr,begin,end);
		}
	}
	
	public void merge(int[] arr, int begin, int end){

		int middle = (begin+end)/2;
		int index1=begin, index2=middle+1, index3=0;

		int[] temp = new int[arr.length];
		
		while(index1<=middle && index2<=end){
			if(arr[index1]<arr[index2]){
				temp[index3] =arr[index1];
				index3++;
				index1++;
			}
			else{
				temp[index3]=arr[index2];
				index3++;
				index2++;
			}
		}
		
		while(index1<=middle){
			temp[index3] =arr[index1];
			index3++;
			index1++;
		}
		
		while(index2<=end){
			temp[index3]=arr[index2];
			index3++;
			index2++;
		}
		int j=0;
		for(int i=begin; i<=end;i++)
			arr[i]=temp[j++];
	}
	
	public int[] display(){
		return input;
	}
}
