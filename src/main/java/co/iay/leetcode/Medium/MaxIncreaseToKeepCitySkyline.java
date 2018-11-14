package co.iay.leetcode.Medium;

public class MaxIncreaseToKeepCitySkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int sum = 0;
        int[] top2bottom = new int[grid.length];
        int[] left2right = new int[grid[0].length];

        for (int i = 0; i < top2bottom.length; ++i) {
            for (int j = 0; j < left2right.length; ++j) {
                int ij = grid[i][j];
                if (top2bottom[i] < ij) {
                    top2bottom[i] = ij;
                }

                if (left2right[j] < ij) {
                    left2right[j] = ij;
                }
            }
        }

        for (int i = 0; i < top2bottom.length; ++i) {
            for (int j = 0; j < left2right.length; ++j) {
                int ij = grid[i][j];
                sum += Math.min(top2bottom[i] - ij, left2right[j] - ij);
            }
        }

        return sum;
    }
}
