package co.iay.leetcode.Easy;

import java.util.Arrays;

/**
 * 976. Largest Perimeter Triangle
 * https://leetcode.com/problems/largest-perimeter-triangle/
 * Given an array A of positive lengths, return the largest perimeter of a triangle with non-zero area, formed from 3 of these lengths.
 * <p>
 * If it is impossible to form any triangle of non-zero area, return 0.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [2,1,2]
 * Output: 5
 * Example 2:
 * <p>
 * Input: [1,2,1]
 * Output: 0
 * Example 3:
 * <p>
 * Input: [3,2,3,4]
 * Output: 10
 * Example 4:
 * <p>
 * Input: [3,6,2,3]
 * Output: 8
 * <p>
 * <p>
 * Note:
 * <p>
 * 3 <= A.length <= 10000
 * 1 <= A[i] <= 10^6
 */
public class LargestPerimeterTriangle {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);

        for (int i = A.length - 1; i >= 2; --i) {
            int l1 = A[i];
            int l2 = A[i - 1];
            int l3 = A[i - 2];

            if (l1 >= l2 + l3) {
                continue;
            }

            return l1 + l2 + l3;
        }

        return 0;
    }
}
