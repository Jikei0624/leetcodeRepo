package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class NO0022 {
    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        if (n <= 0) {
            return result;
        }
        getParenthesis("", n, n);
        return result;
    }
    public void getParenthesis(String str, int left, int right){
        if (left == 0 && right == 0){
            result.add(str);
            return;
        }
        if (left == right){
            getParenthesis(str+"(", left - 1, right);
        } else if (left < right){
            if (left > 0){
                getParenthesis(str + "(", left - 1, right);
            }
            getParenthesis(str + ")", left, right - 1);
        }
    }
}
