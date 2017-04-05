public class Solution {
    public boolean isPowerOfTwo(int n) {

	    /*
	     * The approach is to find if the given number and one less than
	     * the number is equal to zero or not. If yes, return true, else
	     * return false. The concept behind this is that a number of any
	     * power of 2, will always have one set bit in binary, so a
	     * number less than such a number will have all bits set to 1
	     * before that bit, thus the AND of the two should return 0.
	     */
		if(n<=0) return false;
        
        return (n & (n-1))==0;        
    }
}