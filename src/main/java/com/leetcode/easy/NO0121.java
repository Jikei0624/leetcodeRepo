package com.leetcode.easy;

public class NO0121 {
    public int maxProfit(int[] prices) {
        int result = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < minPrice){
                minPrice = price;
            } else if (result < (price - minPrice)){
                result = price - minPrice;
            }
        }
        return result;
    }
}
