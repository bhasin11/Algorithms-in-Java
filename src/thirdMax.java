public class Solution {
    public int thirdMax(int[] nums) {
        // The approach is to keep track of top 3 numbers of the array.
        
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, 
            third = Integer.MIN_VALUE, count = 0;
        boolean flag = true;

        if(nums == null || nums.length == 0) return 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] != Integer.MIN_VALUE && 
                (nums[i] == first || nums[i] == second)) continue;
            
            if(nums[i]>first){
                third = second;
                second = first;
                first = nums[i];
                count++;
            }
            
            else if(nums[i]>second){
                third = second;
                second = nums[i];
                count++;
            }
            else if(nums[i]>=third){
                if(nums[i] == Integer.MIN_VALUE && flag) {
                    flag = false;
                    count++;
                }
                else if(nums[i]!=Integer.MIN_VALUE) count++;
                third = nums[i];
            }
        }
        return count >= 3  ? third : first;
    }
}