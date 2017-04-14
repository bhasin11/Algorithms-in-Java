public class Solution {
    public int minMoves2(int[] nums) {
        /*
         * The approach is to keep equaling two values
         * of the array. For that we can sort the array 
         * first and then can compare two elements from
         * start and end, and add their difference. We
         * can continue until the two pointers meet.
         */
        if(nums == null || nums.length == 0) return 0;
        
        int start = 0, end = nums.length-1, sum = 0;
        Arrays.sort(nums);
        
        while(start<end){
            sum += nums[end--]-nums[start++];
        }
        return sum;
    }
}