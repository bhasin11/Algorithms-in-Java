/*
 * An array of integers is goven in which only one value repeats itself. Find the duplication.
 */

class PracticeArray {

	public int findDuplicate2(int[] nums){

		if(nums == null || nums.length==0) return -1;
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		   
		for(int i=0;i<nums.length;i++){
			if(hm.containsKey(nums[i])){
				return nums[i];
			}
			else hm.put(nums[i], 1);
		 }
		 return -1;
	}
}