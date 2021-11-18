package com.leetcode.medium;

public class NO0005 {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return "";
        }
        int L = 0;
        int R = 0;
        for (int i = 0; i < s.length(); i++) {
            int aroundCenter1 = expandAroundCenter(s, i, i);
            int aroundCenter2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(aroundCenter1, aroundCenter2);
            if(len > R - L){
                L = i - (len - 1) / 2;
                R = i + len / 2;
            }
        }
        return s.substring(L, R + 1);
    }

    private int expandAroundCenter (String s, int L, int R){
        int left = L;
        int right = R;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return right - left - 1;
    }
}
