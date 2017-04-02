public class Solution {
    public int majorityElement(int[] nums) {
        /*
         * The approach is to set the first element of
         * the input array as candidate. We then iterate
         * through the array and check if the current value
         * is equal to candidate. If it is, we increment 
         * the count variable by 1 else we decrement the 
         * count variable by 1. If the count value reaches 
         * below 0, we substitute it with current iteration 
         * value of the array and set the count variable to
         * 0. We will always get a majority element, so we
         * will be able to find a candidate by the end of 
         * the loop. Finally, we return the candidate value.
         */
         
        if(nums == null || nums.length==0) return 0;
        
        int candidate=nums[0], count=1;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i] == candidate) count++;
            else count--;
            
            if(count < 0) {candidate=nums[i]; count=1;}
        }
        
        return candidate;
    }
}