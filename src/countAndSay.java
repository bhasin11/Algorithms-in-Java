public class Solution {
    public String countAndSay(int n) {
        
        /*
         * The approach is to keep a track of number of 
         * counts of current character, and once we reach
         * end of string or encounter another character,
         * we append count and then character to current 
         * string. We continue till end of string, and
         * recursively follow the process until we reach
         * the count 'n'. We then return the string.
         */
        
        String s = "1";
        for(int i=1;i<n;i++){
            s = helper(s);
        }
        return s;
    }
    
    public String helper(String s){
        StringBuilder sb = new StringBuilder();
        char curr = s.charAt(0);
        int count = 1, i = 1;
        
        while(i<s.length()){
            if(curr == s.charAt(i))    count++;
            else{
                sb.append(count).append(curr);
                count = 1;
                curr = s.charAt(i);
            }
            i++;
        }
        sb.append(count).append(curr);
                
        return sb.toString();
    }
}