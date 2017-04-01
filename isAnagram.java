public class Solution {
    public boolean isAnagram(String s, String t) {
        
        /*
         * The approach is to create an array of 26 size, and then increment
         * by 1 for char-'a' index for one string and similarly decrement by 
         * 1 for other string. In the end, if we find any element of the array
         * not to be zero, we can return false. Else, once all iterations are
         * completed, we can return true.
         */
        
        if(s==null || s.length() == 0 || t == null || t.length()==0) return true;
        if(s.length() != t.length()) return false;
        
        int arr[] = new int[26];
        
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0) return false;
        }
        return true;
    }
}