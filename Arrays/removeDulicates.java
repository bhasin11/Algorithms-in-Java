/*
 * Given a sorted array, remove the duplicates in place such that each 
 * element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in 
 * place with constant memory.
 * For example,
 * Given input array nums = [1,1,2],
 * Your function should return length = 2, with the first two elements 
 * of nums being 1 and 2 respectively. It doesn't matter what you leave 
 * beyond the new length.
 */

public int removeDuplicates(int[] nums) {
    
	// solution 2
	int i=1, j=1;
	
	for(j=1;j<nums.length;j++){
		if(nums[j] != nums[j-1]) nums[i++]=nums[j]; 
	}
	
	System.out.println("displaying array");
	
	for(j=0;j<i;j++){
		System.out.println("element "+nums[j]);
	}
	
	return i;
}

/*

	// use hash map and return size to find the value
	
	HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
	hm.put(nums[0], 1);
	for(int i =1; i<nums.length;i++){
		if(!hm.containsKey(nums[i])) hm.put(nums[i], 1); 
	}
	
	return hm.size();
*/