package com.leetcode.medium;

public class NO0122 {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <= 1){
            return 0;
        }
        int totalProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]){
                totalProfit += prices[i] - prices[i - 1];
            }
        }
        return totalProfit;
    }
}
