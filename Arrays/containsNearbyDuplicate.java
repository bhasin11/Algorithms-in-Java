/*
* Given an array of integers and an integer k, find out whether there are 
* two distinct indices i and j in the array such that nums[i] = nums[j] 
* and the difference between i and j is at most k.
* 
*/

public boolean containsNearbyDuplicate(int[] nums, int k) {
	 
	 /*
	  *  we can use two for loops and for each element in outer loop we can run
	  *  inner loop k times and check if similar element if found or not
	  *  
	  *   we can also use a hash map and see if the same element if present is less than
	  *   k indexes away, which can be done through subtracting the value of previous 
	  *   ocurance and current value of i
	  */
	 
	 if(nums==null || k<=0) return false;
	 HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	 
	 for(int i=0;i<nums.length;i++){
		 if(hm.containsKey(nums[i])){
			 if( i - hm.get(nums[i]) <= k) return true;
			 hm.remove(nums[i]);
			 hm.put(nums[i], i);
		 }
		 else hm.put(nums[i], i);
	 }
	 return false;
 }

 /*
 if(nums==null || k<=0) return false;
 Set<Integer> hm = new HashSet<Integer>();
 
 for(int i=0;i<nums.length;i++){
	 if(i>k) hm.remove(nums[i-k-1]);
	 
	 if(hm.contains(nums[i])) return true;
	 hm.add(nums[i]);
 }
 */