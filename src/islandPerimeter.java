public class Solution {
   public int islandPerimeter(int[][] grid) {
       
        /*
         * The approach is to traverse 'grid' from top-to-bottom and left-to-right.
         * If we find 1, we increment 'island' variable by 1, and
         * check if one cell right (if any) is 1, and 
         * check if one cell below (if any) is 1.
         * If we find a 1 in a cell, we increment 'neighbour' variable by 1.
         * Then, we multiply 4 to 'island' and 2 to 'neighbour'.
         * Finally, we return difference of island*4 and neighbour*2.
         */
       
        int islands = 0, neighbours = 0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] == 1){
                    islands++;
                    if(i<grid.length-1 && grid[i+1][j] == 1) neighbours++;
                    
                    if(j<grid[i].length-1 && grid[i][j+1] == 1) neighbours++;
                }
            }
        }
        
        int result = 4*islands;
        result-= 2*neighbours;
        
        return result;
    }
}