package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/11/1.
 * https://leetcode.com/problems/arranging-coins/
 */
public class ArrangingCoins {
    public int arrangeCoins(int n) {
        if (n <= 0) {
            return 0;
        }

        for (long i = (long)Math.ceil(Math.sqrt(n)); i < n; ++i) {
            long v = i * (i + 1) / 2;

            if (v == n) {
                return (int)i;
            }

            if (v > n) {
                return (int)(i - 1);
            }
        }

        return 1;
    }
}
