package co.iay.leetcode.Easy;

/**
 * 941. Valid Mountain Array
 * https://leetcode.com/problems/valid-mountain-array/
 * Given an array A of integers, return true if and only if it is a valid mountain array.
 * <p>
 * Recall that A is a mountain array if and only if:
 * <p>
 * A.length >= 3
 * There exists some i with 0 < i < A.length - 1 such that:
 * A[0] < A[1] < ... A[i-1] < A[i]
 * A[i] > A[i+1] > ... > A[B.length - 1]
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [2,1]
 * Output: false
 * Example 2:
 * <p>
 * Input: [3,5,5]
 * Output: false
 * Example 3:
 * <p>
 * Input: [0,3,2,1]
 * Output: true
 * <p>
 * <p>
 * Note:
 * <p>
 * 0 <= A.length <= 10000
 * 0 <= A[i] <= 10000
 * Solution:
 * 山形数组特点是左单调递增，右单调递减。
 * 从数组两端出发，判断左边是否递增，再判断右边是否递减，最终二者峰值数组下标应当一致，并且不位于数组两端
 */
public class ValidMountainArray {
    public boolean validMountainArray(int[] A) {
        if (A == null || A.length < 3) {
            return false;
        }

        if (A[0] > A[1]) {
            return false;
        }

        int peekL = 0;
        int peekR = A.length - 1;

        while (peekL < A.length - 1 && A[peekL] < A[peekL + 1]) {
            ++peekL;
        }

        if (peekL < A.length - 1 && A[peekL] == A[peekL + 1]) {
            return false;
        }

        while (peekR >= 1 && A[peekR - 1] > A[peekR]) {
            --peekR;
        }

        if (peekR > 0 && A[peekR - 1] == A[peekR]) {
            return false;
        }

        return (peekL != 0 && peekL != A.length - 1) && peekL == peekR;
    }
}
