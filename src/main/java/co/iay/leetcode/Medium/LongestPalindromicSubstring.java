package co.iay.leetcode.Medium;

/**
 * Created by ng on 2017/6/24.
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        char[] sc = s.toCharArray();

        boolean[][] dp = new boolean[sc.length][sc.length];

        for (int i = 0; i < sc.length; ++i) {
            for (int j = 0; j < sc.length; ++j) {
                if (i >= j) {
                    dp[i][j] = true;
                    continue;
                }

                dp[i][j] = false;
            }
        }

        int maxLength = 0;
        int start = 0;
        int end = 0;

        for (int len = 1; len < sc.length; ++len) {
            for (int i = 0; i + len < sc.length; ++i) {
                int j = i + len;

                if (sc[i] != sc[j]) {
                    dp[i][j] = false;
                    continue;
                }

                // a[true]a => [true]
                // a[false]a => [false]
                dp[i][j] = dp[i + 1][j - 1];

                if (dp[i][j] && j - i > maxLength) {
                    maxLength = j - i;
                    start = i;
                    end = j;
                }

            }
        }

        return s.substring(start, end + 1);
    }
}
