public class Solution {
    public int titleToNumber(String s) {
        /*
         * The approach is to move left from the end of 
         * the string and evaluate the ASCII value of 
         * each character. While moving left, we also 
         * multiply the char value to power of 26. This 
         * is similar to decimal numbers are multiplied 
         * by 10 on moving left. We then add the product 
         * to a sum variable. We repeat the process until 
         * we reach the beginning of the array, and then
         * return the sum variable.
         */
         
         if(s==null || s.length()==0) return 0;
        
         int i=s.length()-1, sum=0, j=0, temp=0;
        
         while(i>=0){
             int val = s.charAt(i) - 'A' + 1;
             val = val * (int) Math.pow(26, j);
             sum += val;
             i--;
             j++;
         }
         return sum;
    }
}