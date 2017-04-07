public class Solution {
    public boolean checkPerfectNumber(int num) {
        
        /*
         * The approach is to subtract all values 
         * from 1 to num from temp (which is equal to
         * num initially), which are divisors of
         * num. If finally temp reaches 0, we return
         * true, else false.
         */
        
        if(num <= 1) return false;

        int i=2, temp = num-1;
        while(i <= Math.sqrt(num)){
            if(num%i == 0) temp -= i + (num/i);
            i++;
        }
        return temp == 0;
    }
}