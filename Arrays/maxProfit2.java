/*

Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
*/

public int maxProfit2(int[] prices) {
    if(prices == null) return 0;
    if(prices.length<2) return 0;
    
    int temp=prices[0], sum=0, max=0;
    for(int i=1;i<prices.length;i++){
        //if(prices[i-1]==prices[i]) temp=prices[i];
        if(prices[i-1] > prices[i]){
            sum = sum + max;
            max = 0;
            temp=prices[i];
        }
        else if(prices[i]>temp){
        	System.out.println("ele "+prices[i]);
            max = max + prices[i]-temp;
            temp=prices[i];
        }
    }
    return sum+max;
}