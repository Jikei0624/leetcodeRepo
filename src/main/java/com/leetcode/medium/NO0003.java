package com.leetcode.medium;

import java.util.*;

public class NO0003 {
/*    public static int lengthOfLongestSubstring(String s) {
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
    }*/

    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        HashMap<Character, Integer> subString = new HashMap<>();
        int left = 0, right = 0;
        char[] charS = s.toCharArray();
        while (right < charS.length){
            char c = charS[right];
            right++;

            if (subString.containsKey(c)){
                subString.replace(c, subString.get(c) + 1);
                while (subString.get(c) > 1) {
                    char d = charS[left];
                    left++;
                    if (subString.get(d) == 1){
                        subString.remove(d);
                    } else {
                        subString.replace(d, subString.get(d) - 1);
                    }
                }
            } else {
                subString.put(c, 1);
            }

            res = Math.max(res, right - left);
        }
        return res;
    }
}
