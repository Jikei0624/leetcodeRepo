package com.leetcode.medium;

import java.util.LinkedList;
import java.util.List;

public class NO0054 {
    public List<Integer> spiralOrder(int[][] matrix) {
        //本题遍历时把矩阵看作有四个边界，在遍历过程中不断缩小边界范围。
        int m = matrix.length, n = matrix[0].length;
        int upperBound = 0, lowerBound = m - 1;
        int leftBound = 0, rightBound = n - 1;
        List<Integer> res = new LinkedList<>();
        while (res.size() < m * n){
            //顶部从左到右遍历
            if (upperBound <= lowerBound){
                for (int j = leftBound; j <= rightBound; j++) {
                    res.add(matrix[upperBound][j]);
                }
                upperBound++;
            }

            //最右侧从上到下
            if (leftBound <= rightBound){
                for (int i = upperBound; i <= lowerBound; i++) {
                    res.add(matrix[i][rightBound]);
                }
                rightBound--;
            }

            //底部从右到左
            if (upperBound <= lowerBound){
                for (int j = rightBound; j >= leftBound; j--) {
                    res.add(matrix[lowerBound][j]);
                }
                lowerBound--;
            }

            //左侧从下往上
            if (leftBound <= rightBound){
                for (int i = lowerBound; i >= upperBound; i--) {
                    res.add(matrix[i][leftBound]);
                }
                leftBound++;
            }
        }

        return res;
    }
}
