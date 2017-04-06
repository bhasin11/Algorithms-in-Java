public class Solution {
    public boolean isPalindrome(int x) {
        
        /*
         * The approach is to find the reverse of the number
         * and check if they are equal. To optimize it we can
         * only reverse the first half of the number and check
         * if the numbers are equal. There is another thing we
         * have to condider that reverse of a number can 
         * overflow the maximum value of an integer in Java,
         * so we have to return false, if the reversed numbers
         * value exceeds maximum value of an integer in Java.
         */
        
        if(x < 0) return false;
        if(x < 10) return true;
        if(x%10 == 0) return false;
        int temp2=x, temp=0, reverse=0, value=0;
        
        while(x>reverse){
            value=temp;
            temp = temp*10 + x%10;
            if(value != (temp-(x%10))/10) return false;
            reverse = temp;
            x/=10;
        }
        return reverse == x || reverse/10 == x;
    }
}