public class Solution {
    public int missingNumber(int[] nums) {
        
        /*
         * The approach is to XOR values of the array and all
         * indexes of the array together. We should aslo XOR
         * length of the input array as well as that can be
         * one of the values in the array as well. Once we
         * iterate through the entire array elements and apply
         * XOR operations, we will only be left with the 
         * missing value.
         */
        
        if(nums == null || nums.length == 0) return 0;
        int missing = nums.length;
        
        for(int i=0;i<nums.length;i++){
            missing ^= i;
            missing ^= nums[i];
        }
        return missing;
    }
}

/*

public int missingNumber(int[] nums) {
        // Second Approach
        if(nums == null || nums.length == 0) return 0;
        int missing = nums.length == 1 ? 1: nums.length*(nums.length+1)/2;
        
        for(int i=0;i<nums.length;i++)    missing -= nums[i];
        
        return missing;
}
*/