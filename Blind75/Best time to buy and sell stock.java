/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/

class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxpro=0;
        int minprice=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            minprice=Math.min(minprice,prices[i]);

            maxpro=Math.max(prices[i]-minprice,maxpro);

        }
        return maxpro;
    }
}