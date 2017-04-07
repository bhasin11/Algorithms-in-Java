public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /*
         * The approach is to use two pointers, one starting from
         * left side of the array and other from the end. Add the
         * array values of both pointers and check
         *      > if sum is equal to target, return an array with
         *        both values.
         *      > else if sum is greater than target, decrement
         *        right pointer by 1.
         *      > else increment left pointer by 1.
         * Keep iterating, until left pointer is lesser than 
         * right pointer. Since, it is mentioned that there is 
         * always one solution, we will always get a result.
         */
         
         int output[] = new int[2];
         if(numbers == null || numbers.length == 0) return output;
        
         int start = 0, end = numbers.length-1;
        
         while(start<end){
             if(numbers[start]+numbers[end]==target){
                 output[0]=start+1;
                 output[1]=end+1;
                 break;
             }
             else if(numbers[start]+numbers[end] > target)    end--;
             else start++;
         }
         return output;
    }
}