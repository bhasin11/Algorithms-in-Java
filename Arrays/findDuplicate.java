/*
 * All numbers in an array with length n+1 are in range from 1 to n, so there is at least 
 * one duplication in the array. How to find duplication? Please don't modify the 
 * input array.
 */


class PracticeArray {

	public int findDuplicate(int n){

			if(n<=0) return -1;
			int sum = n*(n-1)/2;
			
			for(int i=0;i<n;i++) sum-=n;
			
			return sum;
	}
}