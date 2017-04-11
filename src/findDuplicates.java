public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        /*
         * The approach is to use current value and go
         * to index (equal to that value) and make value
         * at that index change sign. So, next time if we
         * come to that value and we find, negative value
         * we can add that value to our output list.
         */
        
        List<Integer> result = new ArrayList();
        if(nums == null || nums.length == 0) return result;
        
        for(int i=0;i<nums.length;i++){
            int value = Math.abs(nums[i]) - 1;
            
            if(nums[value]<0) result.add(value + 1);
            nums[value] *= -1;
        }
        return result;
    }
}