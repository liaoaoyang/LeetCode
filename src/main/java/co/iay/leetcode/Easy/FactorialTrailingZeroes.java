package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/7/10.
 */
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int numberOf2 = 0;
        int numberOf5 = 0;

        for (int i = 1; i <= n; ++i) {
            int v = i;
            while (v > 0 && (v % 2 == 0 || v % 5 == 0)) {
                if (v % 2 == 0) {
                    v /= 2;
                    numberOf2++;
                } else {
                    v /= 5;
                    numberOf5++;
                }
            }
        }

        return Math.min(numberOf2, numberOf5);
    }
}
