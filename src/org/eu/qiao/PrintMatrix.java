package org.eu.qiao;

import java.util.ArrayList;

public class PrintMatrix {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1},
                {5},
                {9},
                {13}
        };
        System.out.println(printMatrix(matrix));

    }


    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<Integer>();

        int row = matrix.length;
        int col = matrix[0].length;
        if (row == 0 || col == 0) {
            return res;
        }
        int left = 0, right = col - 1, top = 0, bottom = row - 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;
            if (top != bottom + 1) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if (right != left - 1) {
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
            }
            left++;
        }

        return res;
    }


}
