public class Solution {
    public boolean isPowerOfFour(int num) {
        
        /*
         * The approach is to find a number which satisfies these 3 conditions-
         *   1. greater than 0.
         *   2. Only have one '1' bit in their binary notation.
         *   3. The only '1' bit should be locate at the odd location to make 
         *      sure that the number is a power of 4 and not 2.
         * If all conditions are satisfied, we return true. Else false.
         */
        
        return num > 0 && (num&(num-1)) == 0 && (num & 0x55555555) != 0;
    }
}
     
/*
 * // Second Approach : Change number to quaternary and then check if it starts with "10".
 * public boolean isPowerOfFour(int num) {
 *      return Integer.toString(num, 4).matches("10*");
 *  }
 */
 
 /*
  * // Third Approach
  * public boolean isPowerOfFour(int num) {
  *      if(num<=0) return false;
  *      
  *      while(num%4 == 0)    num/=4;
  *      
  *      return num == 1;
  *  }
  */
 