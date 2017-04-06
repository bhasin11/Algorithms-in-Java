public class Solution {
    public int countSegments(String s) {
        
        /*
         * The approach is to keep finding segments of the
         * string until there are no spaces left. But, we
         * also have to make sure that any of our segments
         * isn't a space itself. To check that we try to
         * trim each segment found. We increment the count
         * each time we iterate. Finally, we return the count
         * variable.
         */
        int count = 0;
        s = s.trim();
        
        if(s.length() == 0) return 0;
        
        while(s.indexOf(" ") != -1){
            int position = s.indexOf(" ");
            count++;
            s = s.substring(position);
            s = s.trim();
        }
        return count + 1;
    }
}