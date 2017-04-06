public class Solution {
    public int[] plusOne(int[] digits) {
        
        /* 
         * The approach is to start from the end of the array,
         * and look for an element which is not equal to 9. If
         * we find such an element, we can increment that by 1
         * and return the modified array. Otherwise, we keep
         * continuing with moving to the next element. If we 
         * complete all iterations, this means all values in
         * the input array were 9, so we have to create a new
         * array whose size will be one more than the size of the
         * input array. We set the first element of that array to
         * 1, and return the new array.
         */   
        
        if(digits == null || digits.length == 0) return new int[0];
        
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }
            else digits[i]=0;
        }
        int result[] = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}