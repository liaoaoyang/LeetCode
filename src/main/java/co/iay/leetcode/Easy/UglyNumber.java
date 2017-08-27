package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/5/8.
 * https://leetcode.com/problems/ugly-number/
 */
public class UglyNumber {
    public boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }

        if (1 == num) {
            return true;
        }

        int[] factors = {2, 3, 5};

        int n = num;

        for (int factor : factors) {
            while (0 == n % factor) {
                n /= factor;

                if (n == 1) {
                    return true;
                }
            }
        }

        return false;
    }
}
