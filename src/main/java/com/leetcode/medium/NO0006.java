package com.leetcode.medium;

import java.util.*;

public class NO0006 {
    public static String convert(String s, int numRows) {
        int restNum = s.length() % (2 * numRows - 2);
        if (restNum > numRows) restNum -= numRows;
        int firstAndLastRow = s.length() / (2 * numRows - 2);
        Map<Integer, Integer> rowMap = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        sb.setLength(numRows);

        //求出每行有多少个字母并存放在map中
        for (int i = 1; i <= numRows; i++) {
            int num = firstAndLastRow;
            if (i != 1 && i != numRows){
                num *= 2;
            }
            if (i < restNum){
                num++;
            }
            rowMap.put(i, num);
        }

        //遍历计算每一个字符在什么位置
        for (int i = 1; i <= s.length(); i++) {
            int row = i % (2 * numRows - 2);
            int realRow = row;
            if(row > numRows){
                realRow = 2 * numRows - row;
            } else if (row == 0){
                realRow = 2;
            }
            int column = i / (2 * numRows - 2);
            if(realRow != 1 && realRow != numRows && column > 0){
                column = column * 2;
                if (row < numRows){
                    column = column - 1;
                }
            } else {
                column = column + 1;
            }

            int sum = column;
            for (int j = 1; j < realRow; j++) {
                sum += rowMap.get(j);
            }
            sb.replace(sum-1, sum, String.valueOf(s.charAt(i - 1)));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int line = 3;
        String s = "PAYPALISHIRING";
        convert(s, line);
//        System.out.println(s.charAt(2));
//        StringBuffer sb = new StringBuffer();
//        sb.setLength(10);
//        sb.replace(0, 7, "s");
//        System.out.println(";" +sb.toString() + ";");
//        System.out.println(sb.length());
    }
}
