/*
 * Find the kth largest element in an unsorted array. Note that 
 * it is the kth largest element in the sorted order, not the 
 * kth distinct element.
	For example,
	Given [3,2,1,5,6,4] and k = 2, return 5.
	supppose we want the kth distinct element then we have to 
	create a set sort the array and then add all elements to
	the set. once done create an array list and put all elements
	now find the kth element
 */

public int findKthLargest(int[] nums, int k) {
	 
	k =nums.length-k;
	ArrayList<Integer> ls=new ArrayList<Integer>();
	
	for(int i=0;i<nums.length;i++)
		ls.add(nums[i]);
	
	Collections.sort(ls);
	System.out.print(ls);
	return ls.get(k);
}