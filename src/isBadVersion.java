/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        /*
         * The approach is to use binary search and 
         * find left-most occurance of the bad version.
         */
        
        int start = 1, end = n, middle = 0;
        
        while(start<end){
            middle = start + (end-start)/2;
            
            if(!isBadVersion(middle)) start = middle+1;
            else end = middle;
        }
        return end;
    }
}