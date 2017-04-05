public class Solution {
    public int searchInsert(int[] nums, int target) {
        
        /*
         * The approach is to use a binary search to find
         * the target value in the given array or find
         * position of such a value, which will be closest
         * greater value than target value.
         */
        
        if(nums == null || nums.length == 0) return 0;
        
        int start = 0, middle = 0, end = nums.length - 1;
        
        while(start <= end){
            middle = start + (end - start)/2;
            if(nums[middle] == target) return middle;
            if(nums[middle] > target) end = middle - 1;
            else start = middle + 1;
        }
        return start;
    }
}