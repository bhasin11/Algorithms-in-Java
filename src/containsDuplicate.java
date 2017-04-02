public class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        /*
         * We can use a hash map to see if the current
         * array element is present in the set. If yes, 
         * we return true. Else we keep iterating. If
         * we complete our iteration and don't find any
         * duplication, we return false.
         */
        
        
         if(nums == null || nums.length==0) return false;
        
         Set<Integer> set = new HashSet<Integer>();
        
         for(int i=0;i<nums.length;i++)
             if(!set.add(nums[i])) return true;
        
         return false;
    }
}