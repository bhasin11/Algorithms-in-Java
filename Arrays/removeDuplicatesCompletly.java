/*
 * Given a sorted array, remove the duplicates in place such that each 
 * element does not appear and return the new length.
 * Do not allocate extra space for another array, you must do this in 
 * place with constant memory.
 * For example,
 * Given input array nums = [1,1,2],
 * Your function should return length = 1, with the element
 * of nums being 2 only. It doesn't matter what you leave 
 * beyond the new length.
 */


public int removeDuplicatesCompletly(int[] nums){
		
	if(nums==null) return 0;
	if(nums.length==0) return 0;
	if(nums.length==1) return 1;
	
	int j=0;
	boolean flag=false;
	
	for(int i=1;i<nums.length;i++){
		if(nums[i] == nums[i-1]){
			flag = true;
		}
		else{
			if(!flag){
				nums[j] = nums[i-1];
				j++;
			}
			flag=false;
		}
	}
	if(nums[nums.length-1] != nums[nums.length-2]) nums[j++]=nums[nums.length-1];
	
	for(int i=0;i<j;i++) System.out.println("element "+nums[i]);
	return j;
}