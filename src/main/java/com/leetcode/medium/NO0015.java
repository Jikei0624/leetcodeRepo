package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NO0015 {
    public List<List<Integer>> threeSum(int[] nums) {
        //排序后采用双指针逼近法
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int k = 0; k < nums.length - 2; k++){
            //先定义一个从头到尾的指针，再从指针位置起到末尾、定义首尾两个指针、向中间逼近
            if (nums[k] > 0) break;
            if (k > 0 && nums[k] == nums[k - 1]) continue;
            int i = k + 1;
            int j = nums.length - 1;
            while (i < j){
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0){
                    //左指针前进并去重
                    while (i < j && nums[i] == nums[++i]);
                } else if (sum > 0){
                    while (i < j && nums[j] == nums[--j]);
                } else {
                    result.add(new ArrayList<>(Arrays.asList(nums[k],nums[i],nums[j])));
                    while (i < j && nums[i] == nums[++i]);
                    while (i < j && nums[j] == nums[--j]);
                }
            }
        }
        return result;
    }
}
