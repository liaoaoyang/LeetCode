package co.iay.leetcode.Medium;

import java.util.ArrayList;

/**
 * Created by ng on 16/9/10.
 * 378. Kth Smallest Element in a Sorted Matrix
 * https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix
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

    private static int binarySearchSolution(int[][] matrix, int k) {
        int matrixLength = matrix.length;
        int L = matrix[0][0];
        int R = matrix[matrixLength - 1][matrixLength - 1];

        while (L < R) {
            int mid = L + ((R - L) / 2);
            int temp = searchLowerThanMid(matrix, matrixLength, mid);

            if (temp < k) {
                L = mid + 1;
            } else {
                R = mid;
            }
        }

        return L;
    }

    private static int searchLowerThanMid(int[][] matrix, int n, int x) {
        int i = n - 1, j = 0, cnt = 0;
        while (i >= 0 && j < n) {
            if (matrix[i][j] <= x) {
                j++;
                cnt += i + 1;
            } else i--;
        }
        return cnt;
    }

    public int kthSmallest(int[][] matrix, int k) {
        return binarySearchSolution(matrix, k);
    }
}
