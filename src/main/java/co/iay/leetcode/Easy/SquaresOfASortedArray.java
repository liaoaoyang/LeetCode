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
 * Solution:
 * 常规情况，求平方数后排序。
 * 但是注意题干中的第三条：A is sorted in non-decreasing order.
 * 说明A是一个单调递增的数组，那么只需要比较两端数字的绝对值。
 * 绝对值大的应该在更靠后的位置，绝对值小的数和下一个数字继续进行比较。
 * 终结条件即左右下标交汇。
 */
public class SquaresOfASortedArray {
    @SuppressWarnings("unused")
    private int[] forceSolution(int[] A) {
        for (int i = 0; i < A.length; ++i) {
            A[i] = A[i] * A[i];
        }

        Arrays.sort(A);

        return A;
    }

    private int[] useDoubleIndexSolution(int[] A) {
        int[] result = new int[A.length];

        for (int left = 0, right = A.length - 1, i = right; left <= right; --i) {
            int absLeftV = A[left] < 0 ? -A[left] : A[left];
            int absRightV = A[right] < 0 ? -A[right] : A[right];

            if (absLeftV > absRightV) {
                result[i] = absLeftV * absLeftV;
                ++left;
            } else {
                result[i] = absRightV * absRightV;
                --right;
            }
        }

        return result;
    }

    public int[] sortedSquares(int[] A) {
        return useDoubleIndexSolution(A);
    }
}
