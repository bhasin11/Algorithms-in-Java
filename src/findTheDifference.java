public class Solution {
    public char findTheDifference(String s, String t) {
        
        /* The approach is to find the ASCII value of each character of both
         * the strings. Add the ASCII values of each character of String 't' 
         * to a temporary variable and subtract the ASCII values of each
         * character of String 's' from the temporary variable. Finally,
         * return the character with ASCII value of the temp variable. 
         */
         
        int temp= t.charAt(t.length()-1);
        
        for(int i=0;i<s.length();i++){
            temp -= s.charAt(i);
            temp += t.charAt(i);
        }
        return (char) temp;
    }
}