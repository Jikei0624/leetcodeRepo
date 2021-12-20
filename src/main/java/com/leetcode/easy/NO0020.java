package com.leetcode.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NO0020 {
    public boolean isValid(String s) {
        boolean result = true;
        Stack<String> stack = new Stack<>();
        List<String> left = Arrays.asList("{", "[", "(");
        List<String> right = Arrays.asList("}", "]", ")");

        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            if (left.contains(c)){
                stack.push(c);
            } else if (stack.size() != 0){
                int i1 = right.indexOf(c);
                String pop = stack.pop();
                int i2 = left.indexOf(pop);
                if (i1 != i2) {
                    result = false;
                    break;
                }
            } else {
                result = false;
                break;
            }
        }
        if (stack.size() != 0){
            result = false;
        }
        return result;
    }
}
