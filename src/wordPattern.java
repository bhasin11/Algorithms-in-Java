public class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        /* 
         * The approach is to go through the pattern letters and 
         * words in parallel and compare the indexes where they 
         * last appeared. If the indexes are equal, continue,
         * else return false.
         */
        
        String[] words = str.split(" ");
        Map index = new HashMap();

        if (words.length != pattern.length())   return false;
    
        for (Integer i=0; i<words.length;i++)
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
                return false;
        return true;
    }
}