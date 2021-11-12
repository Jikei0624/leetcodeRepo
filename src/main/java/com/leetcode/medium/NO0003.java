package com.leetcode.medium;

import java.util.*;

public class NO0003 {
    public static int lengthOfLongestSubstring(String s) {
        //pwwkew
        Map<Character, Integer> lastIndex = new HashMap<>();
        int count = 0;
        int reslut = 0;
        int i = 0;
        for (char c: s.toCharArray()){
            Integer oldIndex = lastIndex.get(c);
            if(oldIndex == null){
                count++;
                reslut = Math.max(count, reslut);
            } else {
                count = Math.min(count + 1, i - oldIndex);
                reslut = Math.max(count, reslut);
            }
            lastIndex.put(c, i);
            i++;
        }
        return reslut;
    }
}
