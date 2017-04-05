public class Solution {
    public boolean isUgly(int num) {
        
        /*
         * The approach is to divide the given number by 2, until
         * until the number is not a multiple of 2. Repeat the
         * process for 3 and 5 as well. Once done, we will return
         * true if the number left is equal to 1.
         */
        
        if(num == 0) return false;
        
        while(num%2 == 0)    num/=2;
        while(num%3 == 0)    num/=3;
        while(num%5 == 0)    num/=5;
        
        return num == 1; 
    }
}