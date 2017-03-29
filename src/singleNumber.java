public class Solution {
    public int singleNumber(int[] nums) {
        /*
         * The approach is to XOR all elements of the 'nums' array.
         * with the help of a for loop. It will gradually remove bits 
         * of all elements occuring twice. The result of each iteration
         * is saved in the first element of the array.
         * Finally, we return the first element of the array.
         * Note: If the array length is 0, 'undefined' value will be returned.
         */
         
         if(nums==null || nums.length==0) return 0;
         
         for(int i=1;i<nums.length;i++)    nums[0] ^= nums[i];
        
         return nums[0];
    }
}