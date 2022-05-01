package com.leetcode.hard;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class NO0076 {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> need = new HashMap<>(), window = new HashMap<>();
        int left = 0, right = 0;
        int valid = 0;
        int start = 0;
        int length = Integer.MAX_VALUE;
        char[] t_char = t.toCharArray();
        char[] s_char = s.toCharArray();
        for (char c: t_char) {
            if (need.containsKey(c)){
                need.replace(c, need.get(c) + 1);
            } else {
                need.put(c, 1);
            }
        }
        while (right < s_char.length){
            char c = s_char[right];
            right++;
            //右滑窗口
            if (need.containsKey(c)){
                if (window.containsKey(c)){
                    window.replace(c, window.get(c) + 1);
                } else {
                    window.put(c, 1);
                }
                if (window.get(c).equals(need.get(c))){
                    valid++;
                }
            }
            //左滑窗口
            while (valid == need.size()){
                if (right - left < length){
                    start = left;
                    length = right - left;
                }
                char d = s_char[left];
                left++;
                if (need.containsKey(d)){
                    if (window.containsKey(d)){
                        if (window.get(d).equals(need.get(d))){
                            valid--;
                        }
                        if (window.get(d) == 1){
                            window.remove(d);
                        } else {
                            window.replace(d, window.get(d) - 1);
                        }
                    }
                }
            }
        }

        return length == Integer.MAX_VALUE ? "":s.substring(start, start + length);
    }
}
