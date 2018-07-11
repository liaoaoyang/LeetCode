package co.iay.leetcode.Easy;

/**
 * 868. Transpose Matrix
 * https://leetcode.com/problems/transpose-matrix/
 * <p>
 * Given a matrix A, return the transpose of A.
 * <p>
 * The transpose of a matrix is the matrix flipped over it's main diagonal,
 * switching the row and column indices of the matrix.
 * <p>
 * Example 1:
 * <p>
 * Input: [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[1,4,7],[2,5,8],[3,6,9]]
 * Example 2:
 * <p>
 * Input: [[1,2,3],[4,5,6]]
 * Output: [[1,4],[2,5],[3,6]]
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 1000
 * 1 <= A[0].length <= 1000
 */
public class TransposeMatrix {
    public int[][] transpose(int[][] A) {
        if (A.length == 0) {
            return new int[][]{};
        }

        int[][] r = new int[A[0].length][A.length];

        for (int i = 0; i < A[0].length; ++i) {
            for (int j = 0; j < A.length; ++j) {
                r[i][j] = A[j][i];
            }
        }

        return r;
    }
}
