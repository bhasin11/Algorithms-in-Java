/*
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

*/


public int maxProfit(int[] prices) {
	     
	 if(prices==null || prices.length<2) return 0;
	 
	 int temp=prices[0], max=0;
	 for(int i =1;i<prices.length;i++){
		 if(temp>prices[i]) temp=prices[i];
		 
		 max = max > prices[i]-temp ? max : prices[i]-temp;
	 }
	 
	 return max;
 }