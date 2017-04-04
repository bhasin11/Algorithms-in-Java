public class Solution {
    public String addStrings(String num1, String num2) {
        /*
         * The approach is to move from end to begining of strings and
         * add correspinding characters of both strings and check if 
         * there is any carry. If there is a carry, save that for next 
         * iteration. Append the sum%10 of both characters to the 
         * result string. If one string terminates, we can still add
         * character of single string to our result.
         */
         
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0; i--, j--){
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            sb.append((x + y + carry) % 10);
            carry = (x + y + carry) / 10;
        }
        if(carry != 0)    sb.append(carry);
        
        return sb.reverse().toString();
    }
}