public class Solution {
    public boolean isHappy(int n) {
        
        /*
         * The approach is to find the sum of squares
         * of each digit of a number, and then check
         * if that is equal to 1 => return true, or
         * if that is already in the set => return false,
         * or else add it to set.
         */
        
        Set<Integer> set = new HashSet<>();
        int temp = n, second = 0;
        while(true){
            while(temp > 0){
                second += (temp%10)*(temp%10);
                temp/=10;
            }
            if(second == 1) return true;
            if(!set.add(second)) return false;
            temp = second;
            second = 0;
        }
    }
}