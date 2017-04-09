public class Solution {
    public boolean isPalindromeSentence(String s) {
        
        /*
         * The approach is to use two pointers and make each stop
         * if they point to a alphanumeric character. If they both
         * point, check if the characters are equal and return false
         * if not. Else continue.
         */
        
        if(s == null || s.length() == 0) return true;
        
        s = s.toLowerCase();
        int i = 0, j = s.length()-1;
        
        while(i<j){
            if( !(s.charAt(i) >=97 && s.charAt(i) <=122) && !(s.charAt(i) >=48 && s.charAt(i) <=57) )    i++;

            if( !(s.charAt(j) >=97 && s.charAt(j) <=122) && !(s.charAt(j) >=48 && s.charAt(j) <=57) )    j--;

            if( ((s.charAt(i) >=97 && s.charAt(i) <=122) || (s.charAt(i) >=48 && s.charAt(i) <=57)) && 
                ((s.charAt(j) >=97 && s.charAt(j) <=122) || (s.charAt(j) >=48 && s.charAt(j) <=57))){
                
                if(s.charAt(i++) != s.charAt(j--)) return false;
            }
        }
        return true;
    }
}

/*

public boolean isPalindromeSentence(String s) {
    // Second Approach: Slower
        
    if(s == null || s.length() == 0) return true;
    
    s = s.toLowerCase();
    
    String str = "abcdefghijklmnopqrstuvwxyz0123456789";
    int i = 0, j = s.length()-1;
    
    while(i<j){
        if(!str.contains(s.charAt(i)+""))    i++;

        if(!str.contains(s.charAt(j)+""))    j--;
        
        if(str.contains(s.charAt(i)+"") && str.contains(s.charAt(j)+"")){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
    }
    return true;
}
*/