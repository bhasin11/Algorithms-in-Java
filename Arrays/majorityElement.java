/*

Given an array of integers in which a single int is repeated more than half times 
total number of elements in the array. Find the repeating element.

*/
class PracticeArray {
	public int majorityElement(int[] nums) {
	    if (nums == null || nums.length == 0) return 0;
	    int cnt = 0;
	    int candidate = 0;
	    for(int i = 0; i < nums.length; i++) {
	        if (cnt == 0) {
	            candidate = nums[i];
	            cnt = 1;
	        } else if (nums[i] == candidate) {
	            cnt++;
	        } else {
	            cnt--;
	        }
	    }
	    return candidate;
	}
}