package com.leetcode.easy;

public class NO0009 {
    public boolean isPalindrome(int x) {
        if (x < 0 || ((x / 10) < 10 && (x / 10) > 1) || (x % 10 == 0 && x != 0)){
            return false;
        }

        int reverseX = 0;
        while (x > reverseX){
            int num = x % 10;
            reverseX = reverseX * 10 + num;
            x /= 10;
        }

        return reverseX == x || reverseX / 10 == x;
    }
}
