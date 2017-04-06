public class Solution {
    public int arrangeCoins(int n) {
        
        /*
         * The approach is to keep subtracting the 
         * current step count from the given number,
         * and increment the value of counter for 
         * each iteration. Finally, return the value 
         * of the counter.
         */
        
        int count = 0, step = 1;
        
        while(n >= step){
            count++;
            n -= step;
            step++;
        }
        return count;
    }
}