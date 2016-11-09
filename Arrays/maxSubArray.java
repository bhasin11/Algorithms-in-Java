/*
Find the sum of max sub array.
nums will atleast have a single element.
*/

public int maxSubArray(int[] nums) {
	 

	 int max = nums[0];
	 int sum = 0;
	 
	 for(int i=0;i<nums.length;i++){
		 sum = sum + nums[i];
		 max = max > sum ? max : sum;
		 if(sum<0) sum=0;
	 }
	 return max;
 }