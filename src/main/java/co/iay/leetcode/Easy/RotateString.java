package co.iay.leetcode.Easy;

/**
 * 796. Rotate String
 * https://leetcode.com/problems/rotate-string/
 * We are given two strings, A and B.
 * <p>
 * A shift on A consists of taking string A and moving the leftmost character to the rightmost position.
 * For example, if A = 'abcde', then it will be 'bcdea' after one shift on A.
 * Return True if and only if A can become B after some number of shifts on A.
 * <p>
 * Example 1:
 * Input: A = 'abcde', B = 'cdeab'
 * Output: true
 * <p>
 * Example 2:
 * Input: A = 'abcde', B = 'abced'
 * Output: false
 * Note:
 * <p>
 * A and B will have length at most 100.
 * Solution：
 * 字符串的首个字符和另一个字符串的某个位置的字符相同时，有可能在反转之后相同，只需要拼接两段字符串之后比较字符串即可
 */
public class RotateString {
    public boolean rotateString(String A, String B) {
        if (A.length() != 0 && A.equals(B)) {
            return true;
        }

        for (int i = 1; i < B.length(); ++i) {
            if (B.charAt(i) == A.charAt(0) && (B.substring(i) + B.substring(0, i)).equals(A)) {
                return true;
            }
        }

        return false;
    }
}
