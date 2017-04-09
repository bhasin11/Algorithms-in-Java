public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        
        /* 
         * The approach is based on two pointers, the idea is 
         * to find the nearest heater for each house, by comparing 
         * the next heater with the current heater. So, we can 
         * return the maximum distance.
         */
         
        Arrays.sort(houses);
        Arrays.sort(heaters);
        
        int i = 0, res = 0;
        
        for (int house : houses) {
            while (i < heaters.length - 1 && heaters[i] + heaters[i + 1] <= house * 2) {
                i++;
            }
            res = Math.max(res, Math.abs(heaters[i] - house));
        }
        return res;
    }
}