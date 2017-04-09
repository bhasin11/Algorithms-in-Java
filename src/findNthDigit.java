public class Solution {
    public int findNthDigit(int n) {
        /*
         * The approach is to find the length of the number 
         * where the nth digit is from. Then, find the actual 
         * number where the nth digit is from. And finally, 
         * find the nth digit and return it.
         */
        
        int count = 1, sum = 1;
        long fast = 9;
        
        while(n > fast*count){
            n -= fast*count;
            count += 1;
            fast *= 10;
            sum *= 10;
        }
        
        int numb = sum + (n-1)/count;
        String num = "" + numb;
        return Character.getNumericValue(num.charAt((n - 1) % count));
    }
}