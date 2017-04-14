public class Solution {
    public int[] singleNumber(int[] nums) {
        
        /*
         * The approach is to find the rightmost set bit, 
         * and then divide numbers into two groups. For 
         * each check if the set bit is there in that number
         * too. This will seperate the numbers into two parts
         * and eventually each will represent a number that we
         * require.
         */
        
        int output[] = new int[2];
        if(nums == null || nums.length == 0) return output;
        
        int temp = nums[0];
        
        for(int i=1;i<nums.length;i++)
            temp^=nums[i];
        
        temp &= -temp;
        
        for(int i=0;i<nums.length;i++){
            if( (temp & nums[i]) != 0)    output[0]^=nums[i];
            else    output[1]^=nums[i];
        }
        
        return output;
    }
}