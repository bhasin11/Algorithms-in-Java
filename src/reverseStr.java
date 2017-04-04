public class Solution {
    public String reverseStr(String s, int k) {
        /*
         * The approach is to reverse a chunk of 'k' characters
         * for every '2*k' characters. To reverse, we can use a 
         * second function. Since, we have used split method to
         * create a temporary variable, the changes made by 
         * second function will also be available in our main
         * function as well. Finally, we can return the modified
         * array after converting it into string.
         */
    
        if(s == null || s.length() == 0) return s;
        int i = 0, j = 0;
        char arr[] = s.toCharArray();
    
        while(i < s.length()){
            j = i+k-1 < s.length()-1 ? i+k-1 : s.length()-1;
            reverse(arr, i, j);
            i += 2*k;
        }
        return new String(arr);
    }

    public void reverse(char arr[], int start, int end){
        while(start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}