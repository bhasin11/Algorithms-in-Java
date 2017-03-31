public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        /* 
         * The approach is to create an array of size 26, and increment
         * value of each element by 1, which appears in magazine string,
         * and start decrementing from ransomNote string. If we ever 
         * encounter a negative value, we will return false. If we 
         * pass all iterations and don't find a negative value, we will
         * simply return true.
         */
        
        if(ransomNote==null ||  magazine==null) return false;
        if(ransomNote.length()==0 && magazine.length()==0) return true;
        
        int[] ch = new int[26];
        
        for(int i=0;i<magazine.length();i++){
            ch[magazine.charAt(i)-'a']++;
        }
        
        for(int i=0;i<ransomNote.length();i++){
            ch[ransomNote.charAt(i)-'a']--;
            if(ch[ransomNote.charAt(i)-'a']<0) return false;
        }
        return true;
    }
}