package com.leetcode.hard;

public class NO0004 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int[] temp = new int[nums1.length + nums2.length];
        double result = 0.0D;
        while (i < nums1.length && j < nums2.length){
            int number1 = nums1[i];
            int number2 = nums2[j];
            if(number1 <= number2){
                temp[i + j] = number1;
                i++;
            } else {
                temp[i + j] = number2;
                j++;
            }
        }
        if (i < nums1.length){
            for(int k = i + j; k < temp.length; k++){
                temp[k] = nums1[i];
                i++;
            }
        } else if(j < nums2.length){
            for(int k = i + j; k < temp.length; k++){
                temp[k] = nums2[j];
                j++;
            }
        }
        if((temp.length % 2) != 0){
            result = temp[temp.length / 2];
        } else {
            int index = temp.length / 2;
            result = (temp[index] + temp[index - 1]) / 2.0;
        }
        return result;
    }
}
