package com.leetcode.easy;

public class NO0303 {
    private int[] nums;
    private int[] preSum;

    //普通一般方法
/*    public NO0303(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int res = 0;
        for(int i = left; i <= right; i++){
            res += nums[i];
        }
        return res;
    }*/

    public NO0303(int[] nums){
        preSum = new int[nums.length + 1];
        for (int i = 1; i < preSum.length; i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int left, int right){
        return preSum[right + 1] - preSum[left];
    }
}
