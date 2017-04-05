public class Solution {
    public String reverseVowels(String s) {
        
        /* 
         * To solve, we use a two pointer approach, one begins from
         * start of the string and other from the end of the string.
         * We move (left one increments, right one decrements) the 
         * two pointers until they both point to a vowel. We then
         * interchange characters of both pointers and proceed. We
         * terminate the loop when left and right pointers meet.
         * Finally, we return the new string.
         */
        
        if(s == null || s.length() == 0) return s;
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int start = 0, end = s.length()-1;
        
        while(start<end){
            if(!vowels.contains(chars[start]+""))    start++;
            
            if(!vowels.contains(chars[end]+""))    end--;
            
            if(vowels.contains(chars[start]+"") && vowels.contains(chars[end]+"")){
                char temp = chars[start];
                chars[start++] = chars[end];
                chars[end--] = temp;
            }
        }
        return new String(chars);
    }
}