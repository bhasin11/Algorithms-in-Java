public class Solution {
    public int longestPalindrome(String s) {
        
        /*
         * The approach is to use a hash map and keep a track of
         * all the characters that have been encountered. If a
         * character is seen again, we can add the length counter
         * by 2 and can remove that element from the hash map.
         * Finally, we can check if the hash map still has any 
         * entries left, if it does, we can add 1 to the length
         * counter else we can simply return the counter.
         */
        
        if(s==null || s.length() == 0) return 0;
        
        int count=0;
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){    
                hm.remove(s.charAt(i));
                count+=2;
            }
            else hm.put(s.charAt(i), 1);
        }
        
        return hm.size() == 0 ? count: count+1;
    }
}