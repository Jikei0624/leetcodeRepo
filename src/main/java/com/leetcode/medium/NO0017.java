package com.leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class NO0017 {
    public List<String> letterCombinations(String digits) {
        List<String> result = new LinkedList<>();
        HashMap<Integer, List<String>> digitsToNums = new HashMap<>();
        digitsToNums.put(2, new LinkedList<>(Arrays.asList("a","b","c")));
        digitsToNums.put(3, new LinkedList<>(Arrays.asList("d","e","f")));
        digitsToNums.put(4, new LinkedList<>(Arrays.asList("g","h","i")));
        digitsToNums.put(5, new LinkedList<>(Arrays.asList("j","k","l")));
        digitsToNums.put(6, new LinkedList<>(Arrays.asList("m","n","o")));
        digitsToNums.put(7, new LinkedList<>(Arrays.asList("p","q","r","s")));
        digitsToNums.put(8, new LinkedList<>(Arrays.asList("t","u","v")));
        digitsToNums.put(9, new LinkedList<>(Arrays.asList("w","x","y","z")));
        int i = 0;
        while (i < digits.length()){
            int num = Character.getNumericValue(digits.charAt(i));
            List<String> list = digitsToNums.get(num);
            if (result.size() == 0){
                result.addAll(list);
            } else {
                List<String> temp = new LinkedList<>();
                for (int y = 0; y < result.size(); y++) {
                    for (int z = 0; z < list.size(); z++) {
                        temp.add(result.get(y).concat(list.get(z)));
                    }
                }
                result = temp;
            }
            i++;
        }

        return result;
    }
}
