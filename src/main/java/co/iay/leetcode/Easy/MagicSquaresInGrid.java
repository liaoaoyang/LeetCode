package co.iay.leetcode.Easy;

/**
 * 840. Magic Squares In Grid
 * https://leetcode.com/problems/magic-squares-in-grid/
 * A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers
 * from 1 to 9 such that each row, column, and both diagonals all have the same sum.
 * <p>
 * Given an grid of integers, how many 3 x 3 "magic square" subgrids are there?
 * (Each subgrid is contiguous).
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [[4,3,8,4],
 * [9,5,1,9],
 * [2,7,6,2]]
 * Output: 1
 * Explanation:
 * The following subgrid is a 3 x 3 magic square:
 * 438
 * 951
 * 276
 * <p>
 * while this one is not:
 * 384
 * 519
 * 762
 * <p>
 * In total, there is only one magic square inside the given grid.
 * Note:
 * <p>
 * 1 <= grid.length <= 10
 * 1 <= grid[0].length <= 10
 * 0 <= grid[i][j] <= 15
 */
public class MagicSquaresInGrid {
    public int numMagicSquaresInside(int[][] grid) {
        int result = 0;

        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */
        for (int i = 0; i <= grid.length - 3; ++i) {
            for (int j = 0; j <= grid[0].length - 3; ++j) {
                boolean error = false;

                for (int ii = i; ii < i + 3 && !error; ++ii) {
                    for (int jj = j; jj < j + 3 && !error; ++jj) {
                        if (grid[ii][jj] <= 0 || grid[ii][jj] > 9) {
                            error = true;
                        }
                    }
                }

                if (error) {
                    continue;
                }

                if (grid[i + 1][j + 1] != 5) {
                    continue;
                }

                // 1 9
                if (grid[i][j] + grid[i + 2][j + 2] != 10) {
                    continue;
                }

                // 2 8
                if (grid[i + 1][j] + grid[i + 1][j + 2] != 10) {
                    continue;
                }

                // 3 7
                if (grid[i + 2][j] + grid[i][j + 2] != 10) {
                    continue;
                }

                // 4 6
                if (grid[i][j + 1] + grid[i + 2][j + 1] != 10) {
                    continue;
                }

                ++result;
            }
        }

        return result;
    }
}
