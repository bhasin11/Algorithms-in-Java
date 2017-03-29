public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        /*
         * The basic approach is to iterate through the input array and 
         * mark elements of that index as negative. In this way all the 
         * numbers that we have seen will be marked as negative. In the 
         * second iteration, if we encounter positive value, it implies 
         * we have never seen  that index before, so just add it to the 
         * 'result' array list. Finally, we return the 'result' array.
         */
         List<Integer> result = new ArrayList<Integer>();
        
         for(int i=0;i<nums.length;i++){
             int value = Math.abs(nums[i])-1;
             
             if(nums[value] > 0)    nums[value] = -nums[value];
         }
        
         for(int i=0;i<nums.length;i++){
            if(nums[i] > 0)    result.add(i+1);
         }
         return result;
    }
}