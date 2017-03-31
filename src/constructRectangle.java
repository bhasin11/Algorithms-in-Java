public class Solution {
    public int[] constructRectangle(int area) {
        /*
         * The approach is to find the square root of the
         * given area. That is because combinations start
         * repeating themselves after the square of any 
         * number. Eg) For 64, 1*64
         *                     2*32
         *                     4*16
         *                     8*8    <<--
         *                     16*4
         *                     32*2
         *                     64*1
         * So, we don't need to traverse after root. We can
         * find our answer (if exists) by finding square 
         * root of the area, and then finding a number less
         * than or equal to square root whose modulo with
         * the area is zero. Once found, this number will be 
         * our larger number, and the result of area divided
         * by larger number will be our second number.
         * Finally, we insert the two numbers in an array
         * and can return it.
         */
        
         int result[] = new int[2];
         int temp = (int) Math.sqrt(area);
    
         while(area%temp != 0)    temp--;
        
         result[0] = area/temp;
         result[1] = temp;
    
         return result;
    }
}