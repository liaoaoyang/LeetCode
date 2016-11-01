package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/11/1.
 */
public class ArrangingCoins {
    public int arrangeCoins(int n) {
        if (n <= 0) {
            return 0;
        }

        for (int i = 2; i < n; ++i) {
            int v = i * (i + 1) / 2;

            if (v > n) {
                return i - 1;
            }

            if (v == n) {
                return i;
            }
        }

        return 1;
    }
}
