public class Solution {
    public List<String> fizzBuzz(int n) {
            /* The approach is to traverse from 1 until 'n' using a for-loop.
             * We check if the current value is a multiple of 3 and 5 both, or
             * We check if the current value is a multiple of 3, or
             * We check if the current value is a multiple of 5, else
             * We Add the current value as a String to the 'result' list.
             * Finally, we return the list.
             */
             List<String> result = new ArrayList<String>();
        
             for(int i=1;i<=n;i++){
                 if(i%3 == 0 && i%5 == 0) result.add("FizzBuzz");
                 else if(i%3 == 0) result.add("Fizz");
                 else if(i%5 == 0) result.add("Buzz");
                 else result.add(""+i);
             }
             return result;
    }
}