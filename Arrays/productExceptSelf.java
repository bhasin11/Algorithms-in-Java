/*
 * Given an array of n integers where n > 1, nums, return an array output 
 * such that output[i] is equal to the product of all the elements of nums 
 * except nums[i].
 * Solve it without division and in O(n).For example, given [1,2,3,4], 
 * return [24,12,8,6].
 */

public int[] productExceptSelf(int[] nums) {
	
	int[] result = new int[nums.length];
    for (int i = 0, tmp = 1; i < nums.length; i++) {
        result[i] = tmp;
        tmp *= nums[i];
    }
	 
	int tmp=1; 
    for (int i = nums.length-1; i >=0; i--) {
    	result[i] *= tmp;
    	tmp *= nums[i];
        System.out.println(result[i]);
    }
	 
    return null;
}