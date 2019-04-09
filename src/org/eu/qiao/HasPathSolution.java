package org.eu.qiao;

/**
 * @ClassNamg HasPathSolution
 * @Description todo
 * Author BOB
 * @Date 2019/4/9 22:51
 * @Version 1.0
 **/
public class HasPathSolution {

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (matrix.length == 0 || str.length == 0)
            return false;

        int[][] flag = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (search(matrix, rows, cols, i, j, str, 0, flag))
                    return true;
            }
        }
        return false;
    }

    public boolean search(char[] matrix, int rows, int cols,
                          int i, int j, char[] str, int index, int[][] flag) {
        int m_i = i * cols + j;
        if (i < 0 || j < 0 || i >= rows || j >= cols || flag[i][j] == 1 || matrix[m_i] != str[index])
            return false;
        if (index >= str.length - 1)
            return true;
        flag[i][j] = 1;
        if (search(matrix, rows, cols, i + 1, j, str, index + 1, flag) ||
                search(matrix, rows, cols, i - 1, j, str, index + 1, flag) ||
                search(matrix, rows, cols, i, j + 1, str, index + 1, flag) ||
                search(matrix, rows, cols, i, j - 1, str, index + 1, flag))
            return true;
        flag[i][j] = 0;
        return false;
    }


}
