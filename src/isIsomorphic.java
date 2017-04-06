public class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        /*
         * The approach is to use character of one string
         * as an index and character of other string as value
         * to that index in a character array. If we find an
         * index which is not zero and has a different value 
         * than the correspondingg character in other string,
         * we return false. Else, if all iterations are done,
         * we return true.
         */
         
        if(s == null || t == null ||
            s.length() != t.length() ) return false;
        
        int arr[] = new int[256];
        char ch[] = new char[256];
        
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)] == 0 && ch[t.charAt(i)] == 0){
                arr[s.charAt(i)] = 1;
                ch[t.charAt(i)] = s.charAt(i);
            }
            else if(ch[t.charAt(i)] != s.charAt(i)) return false;
        }
        return true;
    }
}