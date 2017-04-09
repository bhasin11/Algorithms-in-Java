public class Solution {
    public int countPrimes(int n) {
        
        /*
         * The approach is to move from 2 to n,
         * and check if the current number is 
         * factor of n, if yes, we can make sure
         * not to count this number and all the 
         * multiples of this number less than n.
         */
         
        if(n<3) return 0;
        
        int count = 0;
        boolean[] flags = new boolean[n+1];
        
        for(int i=2;i<n;i++){
            if(!flags[i]){
                count++;
                int val = i, j = 1;
                while(val*j < n){
                    flags[val*j] = true;
                    j++;
                }
            }
        }
        return count;
    }
}