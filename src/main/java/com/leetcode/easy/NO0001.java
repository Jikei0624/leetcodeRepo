package com.leetcode.easy;

public class NO0001 {
    public int[] twoSum (int[] nums, int target){
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int sign = target - nums[i];
            for (int i1 = i + 1; i1 < nums.length; i1++) {
                if (sign == nums[i1]){
                    result[0] = i;
                    result[1] = i1;
                    return result;
                }
            }
        }
        return null;
    }
}
