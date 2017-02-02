package co.iay.leetcode.Medium;

import java.util.ArrayList;

/**
 * Created by ng on 16/9/10.
 */
public class KthSmallestElementInASortedMatrix {
    private static int MODE_HORIZONTAL = 1;
    private static int MODE_VERTICAL = 2;
    private static int MODE_TOP_LEFT = 3;

    private static int TLESolution(int[][] matrix, int k) {
        ArrayList<Integer> smallest = new ArrayList<Integer>();

        int mode = MODE_HORIZONTAL;
        int i = 0;
        int j = 0;
        int s = 0;
        int matrixSize = matrix[0].length;

        while (smallest.size() < k + 1) {
            if (MODE_TOP_LEFT == mode) {
                s++;
                i = s;
                j = s;
                mode = MODE_HORIZONTAL;
            }

            int n = matrix[i][j];
            int p = 0;

            while (p < smallest.size() && n > smallest.get(p)) {
                ++p;
            }

            smallest.add(p, n);

            if (MODE_HORIZONTAL == mode) {
                if (j == matrixSize - 1) {
                    mode = MODE_VERTICAL;
                    ++i;
                    j = s;
                    continue;
                }

                ++j;
            } else {
                if (i == matrixSize - 1) {
                    mode = MODE_TOP_LEFT;
                    continue;
                }

                ++i;
            }
        }

        return smallest.get(k - 1);
    }

    public int kthSmallest(int[][] matrix, int k) {
        return TLESolution(matrix, k);
    }
}
