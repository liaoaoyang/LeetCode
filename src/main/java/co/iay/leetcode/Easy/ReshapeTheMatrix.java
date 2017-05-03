package co.iay.leetcode.Easy;

/**
 * Created by ng on 17/5/3.
 * 566. Reshape the Matrix
 * https://leetcode.com/problems/reshape-the-matrix/
 */
public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int matrixHeight = nums.length;
        int matrixWidth = nums[0].length;

        if (matrixHeight * matrixWidth == r * c) {
            int k = 0;
            int result[][] = new int[r][c];

            for (int i = 0; i < matrixHeight; ++i) {
                for (int j = 0; j < matrixWidth; ++j) {
                    int ii = k / c;
                    int jj = k % c;
                    result[ii][jj] = nums[i][j];
                    ++k;
                }
            }

            return result;
        }

        return nums;
    }
}
