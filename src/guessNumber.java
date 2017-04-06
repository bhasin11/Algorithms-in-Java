/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        /*
         * The approach is to use a Binary Search and
         * check if we get 0 from the guess() API. If
         * we do, we return the correctly guessed value.
         * Else, we change the values of start or end
         * depending if the result is 1 or -1.
         */
        
        int start=1, end=n, middle=0;
        
        while(start <= end){
            middle = start + (end-start)/2;
            
            int result = guess(middle);
            if(result == 0) return middle;
            if(result > 0) start = middle+1;
            else end = middle-1;
        }
        return -1;
    }
}