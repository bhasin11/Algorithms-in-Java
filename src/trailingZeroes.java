public class Solution {
    public int trailingZeroes(int n) {
        
        /*
         * We receive a zero, when we have a 2 and a 5 in the product.
         * Since, we are dealing with factorial, power of 5 will always
         * be lesser than or equal to 2 for any given number. Since,
         * extra 2's don't count as another zero as there is no 5, we
         * can only calculate power of 5 (for the given number) as a 
         * shortcut. The power of 5 we find will be the number of
         * zeroes in the gicen number's factorial representation
         */
        
        int count = 0;
        
        while(n > 0){
            count += n/5;
            n/=5;
        }
        return count;
    }
}