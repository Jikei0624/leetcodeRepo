package com.leetcode.easy;

//It's not easy actually!!!
public class NO0053 {
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (num > 0){
                sum += num;
            } else {
                sum = num;
            }
            result = Math.max(sum, result);
        }

        return result;
    }
}
