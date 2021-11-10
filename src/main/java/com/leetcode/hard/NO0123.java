package com.leetcode.hard;

public class NO0123 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int buy1 = -prices[0];
        int sell1 = buy1 + prices[0];
        int buy2 = sell1 - prices[0];
        int sell2 = buy2 + prices[0];

        for (int i = 1; i < prices.length; i++) {
            // The maximum money left after buying 1st stock.
            buy1 = Math.max(buy1, -prices[i]);

            // The maximum money left after selling 1st stock.
            sell1 = Math.max(sell1, buy1 + prices[i]);

            // The maximum money left after buying 2nd stock.
            buy2 = Math.max(buy2, sell1 - prices[i]);

            // The maximum money left after selling 2nd stock.
            sell2 = Math.max(sell2, buy2 + prices[i]);
        }

        return Math.max(sell1, sell2);
    }
}
