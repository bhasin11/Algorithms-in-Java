public class Solution {
    public int reverse(int x) {
        
        /*
         * The approach is to check if the reversed number 
         * doesn't overflow, so we have to check after rotating 
         * the number in each iteration.
         */
        
        int result = 0, tail = 0, newResult = 0;

        while (x != 0) {
            tail = x % 10;
            newResult = result * 10 + tail;
            
            if ((newResult - tail) / 10 != result)      return 0;
            
            result = newResult;
            x = x / 10;
        }
        return result;
    }
}