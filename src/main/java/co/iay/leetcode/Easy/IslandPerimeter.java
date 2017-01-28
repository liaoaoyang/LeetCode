package co.iay.leetcode.Easy;

/**
 * Created by ng on 17/1/28.
 */
public class IslandPerimeter {
    private static int DIR_HORIZONTAL = 0;
    private static int DIR_VERTICAL   = 1;

    private static int countWithDirection(int[][] grid, int dir) {
        int result = 0;
        int prev = 0;
        int iCount = (dir == DIR_HORIZONTAL ? grid.length : grid[0].length);
        int jCount = (dir == DIR_HORIZONTAL ? grid[0].length : grid.length);

        for (int i = 0; i < iCount; ++i) {
            prev = 0;

            for (int j = 0; j < jCount; ++j) {
                int g = (dir == DIR_HORIZONTAL ? grid[i][j] : grid[j][i]);

                if (g != prev) {
                    ++result;
                }

                if (j == jCount - 1 && g == 1) {
                    ++result;
                }

                prev = g;
            }
        }

        return result;
    }

    public int islandPerimeter(int[][] grid) {
        if (grid.length == 0) {
            return 0;
        }

        return countWithDirection(grid, DIR_HORIZONTAL) + countWithDirection(grid, DIR_VERTICAL);
    }
}
