package com.leetcode.medium;

public class NO0011 {
    public int maxArea(int[] height) {
        int result = 0;
        int i = 0;
        int j = height.length;
        while (i < j){
            int area = (j - i) * Math.min(height[i], height[j]);
            result = Math.max(area, result);
            if (height[i] <= height[j]){
                i++;
            } else {
                j--;
            }
        }
        return result;
    }
}
