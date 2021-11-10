package com.leetcode.medium;

public class NO0121 {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <= 1){
            return 0;
        }
        int maxProfit = 0;
        int maxProfitHere = 0;
        for (int i = 1; i < prices.length; i++) {
            maxProfitHere = Math.max(0, maxProfitHere + prices[i] - prices[i-1]);
            maxProfit = Math.max(maxProfit, maxProfitHere);
        }
        return maxProfit;
    }
}
