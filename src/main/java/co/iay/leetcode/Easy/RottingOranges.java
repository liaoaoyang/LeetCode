package co.iay.leetcode.Easy;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 994. Rotting Oranges
 * https://leetcode.com/problems/rotting-oranges/
 * In a given grid, each cell can have one of three values:
 * <p>
 * the value 0 representing an empty cell;
 * the value 1 representing a fresh orange;
 * the value 2 representing a rotten orange.
 * Every minute, any fresh orange that is adjacent (4-directionally) to a rotten orange becomes rotten.
 * <p>
 * Return the minimum number of minutes that must elapse until no cell has a fresh orange.
 * If this is impossible, return -1 instead.
 * <p>
 * Example 1:
 * <p>
 * <p>
 * <p>
 * Input: [[2,1,1],[1,1,0],[0,1,1]]
 * Output: 4
 * Example 2:
 * <p>
 * Input: [[2,1,1],[0,1,1],[1,0,1]]
 * Output: -1
 * Explanation:  The orange in the bottom left corner (row 2, column 0) is never rotten,
 * because rotting only happens 4-directionally.
 * Example 3:
 * <p>
 * Input: [[0,2]]
 * Output: 0
 * Explanation:  Since there are already no fresh oranges at minute 0, the answer is just 0.
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= grid.length <= 10
 * 1 <= grid[0].length <= 10
 * grid[i][j] is only 0, 1, or 2.
 */
public class RottingOranges {
    private void or(int[][] grid, int i, int j, Set<Point> handled, List<Point> toBeHandled) {
        if (i >= grid.length || j >= grid[0].length || i < 0 || j < 0) {
            return;
        }

        if (grid[i][j] == 2) {
            if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                grid[i][j - 1] = 2;
                Point p = new Point(i, j - 1);

                if (!handled.contains(p)) {
                    toBeHandled.add(p);
                }
            }

            if (j + 1 < grid[0].length && grid[i][j + 1] == 1) {
                grid[i][j + 1] = 2;

                Point p = new Point(i, j + 1);

                if (!handled.contains(p)) {
                    toBeHandled.add(p);
                }
            }

            if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                grid[i - 1][j] = 2;

                Point p = new Point(i - 1, j);

                if (!handled.contains(p)) {
                    toBeHandled.add(p);
                }
            }

            if (i + 1 < grid.length && grid[i + 1][j] == 1) {
                grid[i + 1][j] = 2;

                Point p = new Point(i + 1, j);

                if (!handled.contains(p)) {
                    toBeHandled.add(p);
                }
            }
        }
    }

    public int orangesRotting(int[][] grid) {
        Set<Point> handled = new HashSet<>();
        List<Point> toBeHandled = new ArrayList<>();

        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j] != 2) {
                    continue;
                }

                Point p = new Point(i, j);
                handled.add(p);
                toBeHandled.add(p);
            }
        }

        int result = 0;

        while (toBeHandled.size() > 0) {
            int pop = toBeHandled.size();

            while (pop > 0) {
                Point p = toBeHandled.get(0);
                toBeHandled.remove(0);
                or(grid, p.x, p.y, handled, toBeHandled);
                --pop;
            }

            result = toBeHandled.size() > 0 ? result + 1 : result;
        }

        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return result;
    }
}
