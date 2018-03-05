package co.iay.leetcode.Medium;

/**
 * 647. Palindromic Substrings
 * https://leetcode.com/problems/palindromic-substrings/
 * <p>
 * Given a string, your task is to count how many palindromic substrings in this string.
 * <p>
 * The substrings with different start indexes or end indexes are counted as different substrings
 * even they consist of same characters.
 * <p>
 * Example 1:
 * Input: "abc"
 * Output: 3
 * Explanation: Three palindromic strings: "a", "b", "c".
 * Example 2:
 * Input: "aaa"
 * Output: 6
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 * Note:
 * The input string length won't exceed 1000.
 */
public class PalindromicSubstrings {
    public int countSubstrings(String s) {
        int dp[][] = new int[s.length()][s.length()];
        int n = 0;

        for (int i = 0; i < s.length(); ++i) {
            dp[i][i] = 1;
            ++n;
        }

        for (int i = s.length() - 1; i >= 0; --i) {
            for (int j = i; j < s.length(); ++j) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (i == j - 1 || (j - i >= 2 && dp[i + 1][j - 1] == 1)) {
                        dp[i][j] = 1;
                        ++n;
                    }
                }
            }
        }

        return n;
    }
}
