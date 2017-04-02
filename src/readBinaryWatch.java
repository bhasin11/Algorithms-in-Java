public class Solution {
    public List<String> readBinaryWatch(int num) {
        /*
         * The approach is to use two nested loops. One loop will iterate 
         * through minutes(0-59) and other wil iterate through hours(0-11). 
         * We will calculate number of 1 bits in binary representation of
         * both the numbers. Once done, we will check if the sum of both
         * values is equal to given number. If yes, we will add these 
         * numbers in the form of formatted string to the result list.
         * Loop through both the arrays, and finally return the result
         * list.
         */
         
         List<String> result = new ArrayList();
        
         for(int i=0;i<12;i++){
             for(int j=0;j<60;j++){
                 if( (Integer.bitCount(i) + Integer.bitCount(j)) == num) 
                     result.add(String.format("%d:%02d", i , j));
             }
         }
         return result;
    }
}