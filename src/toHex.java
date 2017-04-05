public class Solution {
    public String toHex(int num) {
        /* 
         * The approach is to keep right shifting the input
         * by 4 and appending the result with array character 
         * to the begining  of the string until the number 
         * becomes 0. Finally, we can return the reesulting
         * string.
         */
         
        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        
        if(num == 0) return "0";
        String result = "";
        while(num != 0){
            result = map[(num & 15)] + result; 
            num = (num >>> 4);
        }
        return result;    
    }
}