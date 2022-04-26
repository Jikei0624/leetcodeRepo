package com.leetcode.medium;

public class NO1109 {
    class Difference {
        // 差分数组
        private int[] diff;

        /* 输入一个初始数组，区间操作将在这个数组上进行 */
        public Difference(int[] nums) {
            assert nums.length > 0;
            diff = new int[nums.length];
            for(int i = 1; i < nums.length; i++){
                diff[i] = nums[i] - nums[i - 1];
            }
        }

        /* 给闭区间 [i,j] 增加 val（可以是负数）*/
        public void increment(int i, int j, int val) {
            diff[i] += val;
            if(j + 1 < diff.length){
                diff[j + 1] -= val;
            }
        }

        /* 返回结果数组 */
        public int[] result() {
            int[] res = new int[diff.length];
            res[0] = diff[0];
            for(int i = 1; i < res.length; i++){
                res[i] = res[i - 1] + diff[i];
            }
            return res;
        }
    }

    public int[] corpFlightBookings(int[][] bookings, int n) {
        int nums[] = new int[n];
        Difference df = new Difference(nums);
        for (int[] booking : bookings) {
            df.increment(booking[0] - 1, booking[1] - 1, booking[2]);
        }
        return df.result();
    }
}
