public class Solution {
    public int minMoves(int[] nums) {
        /*
         * The approach is to find the minimum value of the array.
         * Then subtract it from all other values. Add each difference 
         * to a variable. Finally, the value of this variable will be
         * minimum moves required.
         */
        if(nums==null || nums.length == 0) return 0;
        
        int count=0, min=nums[0];
        
        for(int i=1;i<nums.length;i++)
            if(nums[i] < min) min = nums[i];
        
        for(int i=0;i<nums.length;i++)
            count += Math.abs(nums[i] - min);
        
        return count;
    }
}