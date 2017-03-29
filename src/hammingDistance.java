public class Solution {
    public int hammingDistance(int x, int y) {
        /*  The approach is to XOR 'x' and 'y' first.
         *  The result of these two numbers will have bits which were not equal.
         *  Eg) Suppose x (in binary) is   0001, and
         *      Suppose y (in binary) is   1100, 
         *      Then XOR of 'x' and 'y' is 1101.
         *  We then keep right shifting by 1 and check if the right most bit is 1.
         *  If yes, we increment the counter variable by 1.
         *  Finally, once the number becomes 0, we return the count variable.
         */
         
         x = x^y;
         int count=0;
         while(x>0){
             if(x%2==1) count++;
             x/=2;
         }
         return count;
    }
}