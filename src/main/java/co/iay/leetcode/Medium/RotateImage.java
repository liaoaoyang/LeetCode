package co.iay.leetcode.Medium;

/**
 * Created by ng on 17/4/12.
 * 48. Rotate Image
 * https://leetcode.com/problems/rotate-image
 */
public class RotateImage {
    private static void swap(int[][] matrix, int i1, int j1, int i2, int j2) {
        matrix[i1][j1] += matrix[i2][j2];
        matrix[i2][j2] = matrix[i1][j1] - matrix[i2][j2];
        matrix[i1][j1] = matrix[i1][j1] - matrix[i2][j2];
    }

    public void rotate(int[][] matrix) {
        int matrixSize = matrix.length;

        for (int i = 0; i < matrixSize / 2; ++i) {
            for (int j = 0; j < (matrixSize + 1) / 2; ++j) {
                swap(matrix, i, j, matrixSize - 1 - j, i); // 1<->4
                swap(matrix, matrixSize - 1 - j, i, matrixSize - 1 - i, matrixSize - 1 - j); // 4<->3
                swap(matrix, matrixSize - 1 - i, matrixSize - 1 - j, j, matrixSize - 1 - i);
            }
        }
    }
}
