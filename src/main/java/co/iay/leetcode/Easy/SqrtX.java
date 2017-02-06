package co.iay.leetcode.Easy;

/**
 * Created by ng on 17/2/6.
 */
public class SqrtX {
    public int mySqrt(int x) {
        long middle = 0;
        long middleSquare = 0;
        long left = 0;
        long right = x / 2 + 1;

        while (left <= right) {
            middle = (left + right) / 2;
            middleSquare = middle * middle;

            if (middleSquare == x) {
                return (int)middle;
            }

            if (middleSquare > x) {
                right = middle - 1;
                continue;
            }

            left = middle + 1;
        }

        return (int)right;
    }
}
