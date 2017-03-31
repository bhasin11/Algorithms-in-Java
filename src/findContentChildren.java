public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        /*
         * The approach is to sort both input arrays,
         * then check if the current value of child is
         * less than or equal to the current value of
         * cookie. If yes, move to next child and
         * increment count by 1. In each iteration, we
         * also move the pointer to cookie array by 1.
         * Finally, we return the count variable.
         */
         if(g==null || g.length==0 || s==null || s.length==0) return 0;
        
         Arrays.sort(g);
         Arrays.sort(s);
        
         int i=0, j=0, count=0;
        
         while(i<g.length && j<s.length){
             if(s[j]>=g[i]){
                 count++;
                 i++;
             }
             j++;
         }
         return count;        
    }
}