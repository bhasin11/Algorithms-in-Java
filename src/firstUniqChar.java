public class Solution {
    public int firstUniqChar(String s) {
        /*
         * The approach is to iterate through the string and find out
         * if the index of current character is same as the index of
         * that character from the end. If yes, we will return the 
         * current index. If no such character exists, we will complete
         * our iterations in the loop and will return -1.
         */
         
         if(s==null || s.length()==0) return -1;
        
         for(int i=0;i<s.length();i++){
             if(s.indexOf(""+s.charAt(i)) == s.lastIndexOf(""+s.charAt(i)) )
                 return i;
         }
         return -1;
    }
}