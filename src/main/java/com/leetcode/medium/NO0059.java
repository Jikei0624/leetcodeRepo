package com.leetcode.medium;

public class NO0059 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int upperBound = 0, lowerBound = n - 1;
        int leftBound = 0, rightBound = n - 1;
        int value = 1;
        while (value <= n * n){
            if (upperBound <= lowerBound){
                for (int j = leftBound; j <= rightBound; j++) {
                    res[upperBound][j] = value;
                    value++;
                }
                upperBound++;
            }

            if (leftBound <= rightBound){
                for (int i = upperBound; i <= lowerBound; i++) {
                    res[i][rightBound] = value;
                    value++;
                }
                rightBound--;
            }

            if (upperBound <= lowerBound){
                for (int j = rightBound; j >= leftBound; j--) {
                    res[lowerBound][j] = value;
                    value++;
                }
                lowerBound--;
            }

            if (leftBound <= rightBound){
                for (int i = lowerBound; i >= upperBound; i--) {
                    res[i][leftBound] = value;
                    value++;
                }
                leftBound++;
            }
        }

        return res;
    }
}
