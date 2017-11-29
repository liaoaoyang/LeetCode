package co.iay.leetcode.Easy;

/**
 * Created by ng on 17/2/6.
 * 69. Sqrt(x)
 * https://leetcode.com/problems/sqrtx/
 * Implement int sqrt(int x).
 * <p>
 * Compute and return the square root of x.
 * <p>
 * x is guaranteed to be a non-negative integer.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: 4
 * Output: 2
 * Example 2:
 * <p>
 * Input: 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842...,
 * and since we want to return an integer, the decimal part will be truncated.
 * Solution:
 * 二分法得到平方根
 */
public class SqrtX {
    @SuppressWarnings("all")
    public int mySqrt(int x) {
        long middle = 0;
        long middleSquare = 0;
        long left = 0;
        long right = x / 2 + 1;

        while (left <= right) {
            middle = (left + right) / 2;
            middleSquare = middle * middle;

            if (middleSquare == x) {
                return (int) middle;
            }

            if (middleSquare > x) {
                right = middle - 1;
                continue;
            }

            left = middle + 1;
        }

        return (int) right;
    }
}
