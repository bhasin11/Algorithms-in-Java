/*
* Integers in an array are unique and increasingly sorted. Please write a 
* function/method to find an integer from the array who equals to its index. 
* For example, in the array {-3, -1, 1, 3, 5}, the number 3 equals its index 3.
*/

class PracticeArray{

	public int findSame(int[] arr){
		 
		int start=0, middle=0, end=arr.length-1;
		middle=(start+end)/2;
		
		while(start<=end){
			if(middle==arr[middle]) return middle;
			if(middle>arr[middle]) start=middle+1;
			else end=middle-1;
			
			middle=(start+end)/2;
		}
		System.out.println("ans is ");
		return 0;
	 }
}