public class Solution {
    public int mySqrt(int x) {
        
        /*
         * The approach is to binary search the candidate
         * square root of given value. The possible answers
         * could be the exact square root or a value smaller.
         */
        
        if(x == 0 || x == 1) return x;
        int start = 0, end = x, middle = 0;
        
        while(true){
            middle = start + (end-start)/2;
            
            if(middle > (x/middle)) end = middle - 1;
            else if( (middle+1) > (x/(middle+1)) ) return middle;
            else start = middle + 1;
        }
    }
}