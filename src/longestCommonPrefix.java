public class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        /*
         * The approach is to make the first string of the
         * input array as candidate, and then try if the string
         * is a prefix of next strings. If not, reduce the
         * candidate string by one character from the end and 
         * compare again.
         */
        
        if(strs == null || strs.length == 0) return "";
        
        int i = 1;
        String candidate = strs[0];
        
        while(i < strs.length){
            while(strs[i].indexOf(candidate) != 0){
                candidate = candidate.substring(0, candidate.length() - 1);
            }
            i++;
        }
        return candidate;
    }
}

/*

public String longestCommonPrefix(String[] strs) {
    
    // Second Approach: Slower

    if(strs == null || strs.length == 0) return "";
    String output = "";
    
    for(int i=0;i<strs[0].length();i++){
        char ch = strs[0].charAt(i);
        
        for(int j=1;j<strs.length;j++){
            if(i>=strs[j].length()) return output;
            if(strs[j].charAt(i) != ch) return output;
        }
        output += ""+ch;
    }
    return output;
}

*/