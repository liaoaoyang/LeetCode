package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/6/16.
 * https://leetcode.com/problems/power-of-two/
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if (n % 2 == 1) {
                return false;
            }

            n /= 2;
        }

        return true;
    }
}
