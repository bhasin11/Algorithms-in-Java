/*
Given an array of ints and an integer value, rotate the array from begin to that point
and beyond that poin to end
*/

public int[] rotate(int[] nums, int k) {    

	 k=k%nums.length;
	 
	 reverse(nums,0,nums.length-1);
	 reverse(nums,0,k-1);
	 reverse(nums,k,nums.length-1);
	 
	 for(int i=0;i<nums.length;i++){
		 System.out.println(nums[i]);
	 }
	 
	 return nums;
}