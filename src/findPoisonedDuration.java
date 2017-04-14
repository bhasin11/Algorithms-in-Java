public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        
        /*
         * The approach is to add the duration for each attack and
         * if the difference between current attack and previous
         * one is less than given 'duration', then we have to
         * reduce the difference from the total attack sum as well.
         */
        
        if(timeSeries == null || timeSeries.length == 0) return 0;
        
        int total = duration;
        
        for(int i=1;i<timeSeries.length;i++){
            if(timeSeries[i]-timeSeries[i-1] < duration)
                total-=(timeSeries[i-1]+duration-timeSeries[i]);
            
            total+=duration;
        }
        return total;
    }
}