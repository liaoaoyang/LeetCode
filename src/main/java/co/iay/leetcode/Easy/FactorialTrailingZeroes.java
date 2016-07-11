package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/7/10.
 */
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        if (n <= 0) {
            return 0;
        }

        int result = 0;

        while (n > 0) {
            result += n / 5;
            n /= 5;
        }

        return result;
    }
}
