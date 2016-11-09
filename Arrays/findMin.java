/*
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
	Find the minimum element.
	You may assume no duplicate exists in the array.
 */
public int findMin(int[] nums) {
    
    if(nums==null) return 0;
	if(nums.length==1) return nums[0];
	
	int temp = nums[0];
	
	for(int i=1;i<nums.length;i++)
		if(temp>nums[i]) return nums[i];
	
	return temp;
}