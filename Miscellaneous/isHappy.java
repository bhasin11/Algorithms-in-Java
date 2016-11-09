/*

Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 19 is a happy number

12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

*/

public boolean isHappy(int n) {
		
	HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
     if(n==0) return false;
     if(n==1) return true;
     
     int sum=0;
     while(true){
    	 sum = sum + ((n%10)*(n%10));
    	 n = n/10;
    	 if(n == 0){
    		 if(sum==1) return true;
    		 else{
    			 if(hm.containsKey(sum)) return false;
    			 else hm.put(sum, 1);
    			 n=sum;
    			 sum=0;
    		 }
    	 }
     }
 }