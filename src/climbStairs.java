public class Solution {
    public int climbStairs(int n) {
        
        /*
         * The approach is to keep track of the last 
         * two steps. Our current value, will be equal
         * to sum of previous two steps.
         */
        
        if(n <= 0) return 0;
        
        int oneaway = 1, twoaway = 0;
        
        for(int i=0;i<n;i++){
            int temp = oneaway;
            oneaway += twoaway;
            twoaway = temp;
        }
        return oneaway;
    }
}