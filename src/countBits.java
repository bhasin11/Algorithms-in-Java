public class Solution {
    public int[] countBits(int num) {
        
        /*
         * The approach is that all even numbers have the same
         * number of bits as their half values have. But, for
         * the odd numbers we have an additional one (the right
         * most bit). Following this we can calculate the number
         * of bits of each number starting from 0 upto 'num'.
         */
        
        int output[] = new int[num+1];
        
        for(int i=0;i<=num;i++){
            output[i] = output[i/2] + (1 & i);
        }
        return output;
    }
}