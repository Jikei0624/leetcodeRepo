package com.leetcode.easy;

import java.util.Arrays;
import java.util.Scanner;

public class NO0001 {
    public static int[] twoSum (int[] nums, int target){
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int sign = target - nums[i];
            for (int i1 = i + 1; i1 < nums.length; i1++) {
                if (sign == nums[i1]){
                    result[0] = i;
                    result[1] = i1;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10000];
        int i = 0;
        System.out.println("array nums(end with enter):");
        String str = scanner.nextLine();
        for (int j = 0; j < str.length(); j++) {
            while (str.charAt(j) <= '9' && str.charAt(j) >= '0'){
                //
            }
        }
//        while (in.hasNextLine()){
//            int temp = in.nextInt();
//            nums[i] = temp;
//            i++;
//        }
//        System.out.println("target:");
//        int target = scanner.nextInt();
//        int[] ints = twoSum(nums, target);
//        for (int anInt : ints) {
//            System.out.print(anInt + " ");
//        }
    }
}
