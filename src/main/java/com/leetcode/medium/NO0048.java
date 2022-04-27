package com.leetcode.medium;

public class NO0048 {
    public void rotate(int[][] matrix) {
        //对角线轴对称旋转（对称轴从左上到右下）
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //沿左右中线对称
        for (int i = 0; i < matrix.length; i++) {
            int length = matrix[i].length;
            for (int j = 0; j < length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][length - i - 1];
                matrix[i][length - i - 1] = temp;
            }
        }
    }
}
