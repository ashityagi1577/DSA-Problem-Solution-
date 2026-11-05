/*
Problem Number: 121
Problem Name: Best Time to Buy and Sell Stock


Problem Link:
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

Solution Link:
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/2008308095

*/


class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;
       for(int i = 1; i < prices.length; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
            int profit = prices[i] - minPrice;
            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
