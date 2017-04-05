public class Solution {
    public int hammingWeight(int n) {
        
        /*
         * An Integer in Java has 32 bits, e.g. 00101000011110010100001000011010.
         * To count the 1s in the Integer representation we put the input int
         * n in bit AND with 1 (that is represented as 00000000000000000000000000000001, 
         * and if this operation result is 1, that means that the last bit of the input 
         * integer is 1. Thus we add it to the 1s count. Once we iterate through the
         * input number, we return the count.
         */
        int count=0; 
        
        while(n != 0){
            if((n&1)==1) count++;
            n  >>>= 1;
        }
        return count;
    }
}