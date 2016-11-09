// return true if at least one number repeats itself in the array
// another solution is to sort the array and then compare two consecutive
// elements through out the array

public boolean containsDuplicate(int[] nums){
		
	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	   
	for(int i=0;i<nums.length;i++){
		if(hm.containsKey(nums[i])){
			return true;
		}
		else hm.put(nums[i], 1);
	 }
	 return false;
}