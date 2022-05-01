package com.leetcode.easy;

public class NO1103 {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int i = 0, j = 1;
        while(candies > 0 ){
            if(candies >= j){
                res[i] += j;
                candies -= j;
            }else{
                res[i] += candies;
                candies = 0;
            }
            j++;
            if(i == num_people - 1){
                i = 0;
            } else{
                i++;
            }
        }
        return res;
    }
}
