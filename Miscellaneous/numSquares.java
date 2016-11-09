/*
 * Given a positive integer n, find the least number of perfect square 
 * numbers (for example, 1, 4, 9, 16, ...) which sum to n.
 * For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given 
 * n = 13, return 2 because 13 = 4 + 9.
 */

 public int numSquares(int n) {
		
	if(n<=0) return 0;
	if(n==1 || n==2||n==3) return n;
	
	int i=2;
	while(i*i < n) i++;
	
	i--;
	i=i*i;
	
	return 0;
}