package co.iay.leetcode.Easy;

/**
 * Created by ng on 17/1/28.
 */
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int result = 0;
        int hPrev = 0;
        int colCount = 0;
        int rowCount = grid.length;

        for (int i = 0; i < rowCount; ++i) {
            colCount = grid[i].length;
            hPrev = 0;

            for (int j = 0; j < colCount; ++j) {
                int hg = grid[i][j];

                if (hg != hPrev) {
                    ++result;
                }

                if (j == colCount - 1 && hg == 1) {
                    ++result;
                }

                hPrev = hg;
            }
        }

        int vPrev = 0;

        for (int k = 0; k < colCount; ++k) {
            vPrev = 0;

            for (int l = 0; l < rowCount; ++l) {
                int vg = grid[l][k];

                if (vg != vPrev) {
                    ++result;
                }

                if (l == rowCount - 1 && vg == 1) {
                    ++result;
                }

                vPrev = vg;
            }
        }

        return result;
    }
}
