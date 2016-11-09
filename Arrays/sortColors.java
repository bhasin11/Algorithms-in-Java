/*
* Given an array with n objects colored red, white or blue, 
* sort them so that objects of the same color are adjacent, 
* with the colors in the order red, white and blue.
* Here, we will use the integers 0, 1, and 2 to represent 
* the color red, white, and blue respectively.

Note:
You are not suppose to use the library's sort function for this problem.
*/

public int[] sortColors(int[] arr) {
	 
	if(arr!=null){
		 
	int i=-1, j=-1, k=-1;
	
	for(int p = 0; p < arr.length; p++){
		if(arr[p] == 0){
			arr[++k]=2;
			arr[++j]=1;
			arr[++i]=0;
		}
		else if (arr[p] == 1){
			arr[++k]=2;
			arr[++j]=1;
			
		}
		else if (arr[p] == 2){
			arr[++k]=2;
		}
	}
	return arr;		 
}