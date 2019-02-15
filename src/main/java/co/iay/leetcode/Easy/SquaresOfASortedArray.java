package co.iay.leetcode.Easy;

import java.util.Arrays;

/**
 * 977. Squares of a Sorted Array
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 * Given an array of integers A sorted in non-decreasing order,
 * return an array of the squares of each number, also in sorted non-decreasing order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Example 2:
 * <p>
 * Input: [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 * A is sorted in non-decreasing order.
 */
public class SquaresOfASortedArray {
    private int[] forceSolution(int[] A) {
        int[] result = new int[A.length];

        for (int i = 0; i < A.length; ++i) {
            result[i] = A[i] * A[i];
        }

        Arrays.sort(result);

        return result;
    }

    public int[] sortedSquares(int[] A) {
        return forceSolution(A);
    }
}
