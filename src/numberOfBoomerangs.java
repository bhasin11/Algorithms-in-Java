public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        /*
         * The approach is to find how many points have the same 
         * distance from a given point. If we find more than one, 
         * we can surely add them to our output count varible. To
         * calculate distance we have used another function, and
         * to keep track of the distances from the current point,
         * we create a new Map object for each outer iteration.
         * Once we are done with the iterations, we return the
         * count variable.
         */
         
        HashMap<Integer, Integer> hm = new HashMap<>();
        int result=0;
        
        for(int i=0;i<points.length;i++){
            for(int j=0;j<points.length;j++){
                if(i==j) continue;
                
                int a=points[i][0]-points[j][0];
                int b=  points[i][1]-points[j][1];
                a*=a;
                b*=b;
                a+=b;
                hm.put(a,hm.getOrDefault(a,0)+1);
            }
            
            for(int n:hm.values())    result+=n*(n-1);
    
            hm.clear();
        }
        return result;
    }
}