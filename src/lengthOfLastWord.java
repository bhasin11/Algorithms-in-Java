public class Solution {
    public int lengthOfLastWord(String s) {
        
        /*
         * The approach is to find consider the case where there
         * are two or more spaces consecutively, and trim the input
         * string. Then if we find last space in string 's', we can 
         * return the distance from index to end of list. If we are
         * unable to find any space character, we can return the 
         * length of the string, as in this case, the string has
         * only one single word.
         */
        
        s = s.trim();
        if(s == null || s.length() == 0) return 0;
        
        if(s.lastIndexOf(" ") != -1)    return s.length()-s.lastIndexOf(" ")-1;
        
        return s.length();
    }
}