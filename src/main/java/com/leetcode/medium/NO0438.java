package com.leetcode.medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class NO0438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new LinkedList<>();
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        int left = 0, right = 0;
        int valid = 0;
        char[] charS1 = p.toCharArray();
        char[] charS2 = s.toCharArray();
        for (char c: charS1){
            if (need.containsKey(c)){
                need.replace(c, need.get(c) + 1);
            } else {
                need.put(c, 1);
            }
        }
        while (right < charS2.length){
            char c = charS2[right];
            right++;
            if (need.containsKey(c)){
                if (window.containsKey(c)){
                    window.replace(c, window.get(c) + 1);
                } else {
                    window.put(c, 1);
                }
                if (window.get(c).equals(need.get(c)))
                    valid++;
            }

            while (right - left >= charS1.length){
                if (valid == need.size())
                    res.add(left);
                char d = charS2[left];
                left++;
                if (need.containsKey(d)){
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

        return res;
    }
}
