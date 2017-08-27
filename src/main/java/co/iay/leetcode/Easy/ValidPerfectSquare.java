package co.iay.leetcode.Easy;

/**
 * Created by ng on 17/2/26.
 * 367. Valid Perfect Square
 * https://leetcode.com/problems/valid-perfect-square
 */
public class ValidPerfectSquare {
    @SuppressWarnings("all")
    private static int mySqrt(int x) {
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

    public boolean isPerfectSquare(int num) {
        int sqrtNum = mySqrt(num);

        return sqrtNum * sqrtNum == num;
    }
}
