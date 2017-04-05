public class Solution {
    public int maxSubArray(int[] nums) {
        
        /*
         * The approach is to find the sum of
         * contiguous elements of the array, 
         * and replace it with current max if
         * it is lesser than sum. Also, make
         * sum equal to zero, if it is lesser
         * than zero.
         */
        
        int max = nums[0], sum = 0;
		 
		for(int i=0;i<nums.length;i++){
		    sum = sum + nums[i];
			max = max > sum ? max : sum;
			if(sum<0) sum=0;
	    }
		return max;
    }
}