/*
 * There is a fence with n posts, each post can be painted with one of the k colors.

	You have to paint all the posts such that no more than two adjacent fence posts have the same color.

	Return the total number of ways you can paint the fence.

	Note:
	n and k are non-negative integers.
 */

 public int paintFence(int n, int k){
		
	if(n==0) return 0;
	if(n==1) return k;
	if(k==0) return 0;
	if(k==1) return n;
	
	int multi = k;
	
	multi *= (int)( Math.pow(k-1, n-1) );
	
	return m;
}