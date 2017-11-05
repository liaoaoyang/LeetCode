package co.iay.leetcode.Easy;

/**
 * 680. Valid Palindrome II
 * https://leetcode.com/problems/valid-palindrome-ii/
 * Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.
 * <p>
 * Example 1:
 * Input: "aba"
 * Output: True
 * Example 2:
 * Input: "abca"
 * Output: True
 * Explanation: You could delete the character 'c'.
 * Note:
 * The string will only contain lowercase characters a-z. The maximum length of the string is 50000.
 * Solution:
 * 首先通过Manacher方法解决单双长度问题（字符中间增加#）。
 * 第一次先判断不匹配位置，如果存在不匹配问题，那么可以尝试删去前后字符尝试继续进行排查。
 */
public class ValidPalindromeII {
    private int getMisMatchPosition(String s) {
        int sLen = s.length();

        for (int i = 0; i < sLen / 2; ++i) {
            if (s.charAt(i) != s.charAt(sLen - 1 - i)) {
                return i;
            }
        }

        return -1;
    }

    public boolean validPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        sb.append('#');

        for (int i = 0; i < s.length(); ++i) {
            sb.append(s.charAt(i));
            sb.append('#');
        }

        s = sb.toString();
        int misMatchPos = getMisMatchPosition(s);

        if (-1 == misMatchPos) {
            return true;
        } else if (-1 == getMisMatchPosition(s.substring(misMatchPos + 2, s.length() - misMatchPos))) {
            return true;
        } else if (-1 == getMisMatchPosition(s.substring(misMatchPos, s.length() - misMatchPos - 2))) {
            return true;
        }

        return false;
    }
}
