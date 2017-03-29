public class Solution {
    public boolean detectCapitalUse(String word) {
        /* 
         * The approach is to use a simple regular expression and
         * use the matches() to search for a match between 
         * word and regular expression.
         */
        return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
    }
}