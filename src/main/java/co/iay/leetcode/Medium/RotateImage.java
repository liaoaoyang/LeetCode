package co.iay.leetcode.Medium;

/**
 * Created by ng on 17/4/12.
 * 48. Rotate Image
 * https://leetcode.com/problems/rotate-image
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        int matrixSize = matrix.length;

        for (int i = 0; i < matrixSize / 2; ++i) {
            for (int j = 0; j < (matrixSize + 1) / 2; ++j) {
                int now = matrix[i][j];

                matrix[i][j] = matrix[matrixSize - 1 - j][i];
                matrix[matrixSize - 1 - j][i] = matrix[matrixSize - 1 - i][matrixSize - 1 - j];
                matrix[matrixSize - 1 - i][matrixSize - 1 - j] = matrix[j][matrixSize - 1 - i];
                matrix[j][matrixSize - 1 - i] = now;
            }
        }
    }
}
