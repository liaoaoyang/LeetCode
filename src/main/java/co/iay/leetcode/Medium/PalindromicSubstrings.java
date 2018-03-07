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
 * Solution:
 * 回文aa/aba两种形式，使用二维数组dp记录某个区间是否是回文，dp[i][j]表示原字符串[i:j]区间是否是回文。
 * 判断区间首尾两个字符是否相同，如果相同再判断区间中间的部分是否是回文，如果这两个条件均符合，则新的区间必然是回文。
 * 此处注意遍历需要从后往前，可以避免遗漏。
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
