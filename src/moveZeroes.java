public class Solution {
    public void moveZeroes(int[] nums) {
        /*
         * The approach is to traverse through the given array and check
         * if a given value is zero or not. If not, move that value to the
         * current counter value and then increment that counter. In this
         * way, we move all our non-zero values to the left side of the
         * array and also maintain the relative order of the values. Then,
         * we start another iteration starting from the current counter 
         * value and till length of the array. In each iteration, we mark
         * the values as 0.
         */
         
         if(nums == null || nums.length == 0) return;
        
         int count=0;
        
         for(int i=0;i<nums.length;i++)
             if(nums[i] != 0) nums[count++] = nums[i];
        
         for(int i=count;i<nums.length;i++)     nums[i] = 0;
    }
}