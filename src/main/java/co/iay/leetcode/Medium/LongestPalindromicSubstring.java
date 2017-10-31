package co.iay.leetcode.Medium;

/**
 * Created by ng on 2017/6/24.
 * 5. Longest Palindromic Substring
 * https://leetcode.com/problems/longest-palindromic-substring/
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 * <p>
 * Example:
 * <p>
 * Input: "babad"
 * <p>
 * Output: "bab"
 * <p>
 * Note: "aba" is also a valid answer.
 * Example:
 * <p>
 * Input: "cbbd"
 * <p>
 * Output: "bb"
 * Solution:
 * Manacher算法，即将字符串间隔中加上分隔字符（一般为#）,使得回文串变为单数长度。
 * 之后逐个判断字串是否回文即可。
 */
public class LongestPalindromicSubstring {
    @SuppressWarnings("unused")
    private String dpSolution1(String s) {
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

    private String manacherSolution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();

        sb.append('#');

        for (char c : chars) {
            sb.append(c + "#");
        }

        char[] ms = sb.toString().toCharArray();
        int longest = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < ms.length; ++i) {
            int extend = 0;

            while (i - extend >= 0 &&
                    i + extend < ms.length &&
                    ms[i - extend] == ms[i + extend]) {
                ++extend;
            }

            if ((extend - 1) * 2 + 1 > longest) {
                extend -= 1;
                longest = extend * 2 + 1;
                start = i - extend;
                end = i + extend;
            }
        }

        return new String(ms).substring(start, end).replace("#", "");
    }

    public String longestPalindrome(String s) {
        return manacherSolution(s);
    }
}
