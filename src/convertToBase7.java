public class Solution {
    public String convertToBase7(int num) {
        
        /* 
         * The approach is to keep dividing the input
         * by 7 and appending the result in the begining 
         * of the string until the number becomes 0.
         * We also have to keep record if the number was 
         * negative or not. Finally, we can return the 
         * reesulting string.
         */
         
        int sign = num >= 0 ? 1 : -1;
        String result = "";
        num = Math.abs(num);
        while(num > 0){
            result = (num%7) + result;
            num = (int) Math.floor(num/7);
        }
        if(result == "") return "0";
        
        return sign == 1 ? result : "-"+result;
    }
}