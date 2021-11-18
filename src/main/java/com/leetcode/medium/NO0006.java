package com.leetcode.medium;

import java.util.*;

public class NO0006 {
    public String convert(String s, int numRows) {
        int restNum = s.length() % (2 * numRows - 2);
        int firstAndLastRow = s.length() / (2 * numRows - 2);
        Map<Integer, Integer> rowMap = new HashMap<>();

        //求出每行有多少个字母并存放在map中
        for (int i = 1; i <= numRows; i++) {
            int num = firstAndLastRow;
            if (i != 1 && i != numRows){
                num += 2;
            }
            if (i < restNum){
                num++;
            }
            rowMap.put(i, num);
        }

        for (int i = 0; i < s.length(); i++) {
            int row = i % (2 * numRows - 2);
        }

        return null;
    }
}
