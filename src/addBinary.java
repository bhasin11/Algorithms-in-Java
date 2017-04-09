public class Solution {
    public String addBinary(String a, String b) {
        
        /*
         * The approach is to use two pointers from
         * end of the strings, and add the corresponding 
         * values of each string. Append their sum 
         * without overflow in the output string, and 
         * maintain the overflow for next iteration. 
         * Finally, we can return the output string.
         */
        
        if(a == null || a.length() == 0) return b;
        if(b == null || b.length() == 0) return a;
        
        int i = a.length() - 1, j = b.length() - 1,
            carry = 0;
        StringBuilder sb = new StringBuilder("");
        
        while(i>=0 || j>=0){
            if(i>=0) carry += a.charAt(i--) - 48;
            if(j>=0) carry += b.charAt(j--) - 48;
            sb.append(carry%2);
            carry/=2;
        }
        if(carry != 0) sb.append("1");
        return sb.reverse().toString();
    }
}