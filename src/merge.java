public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        /*
         * The approach is to use two pointers, one for each array,
         * and choose the larger number of the two values pointed
         * by pointers. Decrement the counter which has larger value,
         * and move the larger value to the third pointer. The third
         * pointer starts from the last index of nums1 array and 
         * decrements by 1 when a value is moved.
         */
        
        int k = nums1.length - 1;
        m--;
        n--;
        
        while(m>=0 || n>=0){
            if(m>=0 && n>=0){
                if(nums1[m] > nums2[n]){
                    nums1[k--] = nums1[m--];
                }
                else nums1[k--] = nums2[n--];
            }
            else if(m>=0) nums1[k--] = nums1[m--];
            else if(n>=0) nums1[k--] = nums2[n--];
        }
    }
}