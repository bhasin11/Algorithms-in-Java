public class Solution {
    public void rotate(int[] nums, int k) {
        
        /*
         * The approach is to reverse the whole
         * array and then reverse from the kth
         * index.
         */
        
        if(nums == null || nums.length == 0) return;
        
        k%=nums.length;
        
        helper(nums, 0, nums.length-1);
        helper(nums, 0, k-1);
        helper(nums, k, nums.length-1);
    }
    
    public void helper(int nums[], int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}