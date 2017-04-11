public class Solution {
    public String convertToTitle(int n) {
        
        /*
         * The approach is to make the remainder 
         * value of the number (as a character)
         * and add it to output string. Keep
         * adding, until number becomes 0.
         */
         
        StringBuilder result = new StringBuilder("");

        while(n>0){
            n--;
            result.insert(0, (char)('A' + n % 26));
            n /= 26;
        }

        return result.toString();
    }
}