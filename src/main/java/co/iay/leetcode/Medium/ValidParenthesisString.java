package co.iay.leetcode.Medium;

/**
 * 678. Valid Parenthesis String
 * https://leetcode.com/problems/valid-parenthesis-string/
 * Given a string containing only three types of characters: '(', ')' and '*', write a function to check whether this string is valid. We define the validity of a string by these rules:
 * <p>
 * Any left parenthesis '(' must have a corresponding right parenthesis ')'.
 * Any right parenthesis ')' must have a corresponding left parenthesis '('.
 * Left parenthesis '(' must go before the corresponding right parenthesis ')'.
 * '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
 * An empty string is also valid.
 * Example 1:
 * Input: "()"
 * Output: True
 * Example 2:
 * Input: "(*)"
 * Output: True
 * Example 3:
 * Input: "(*))"
 * Output: True
 * Note:
 * The string size will be in the range [1, 100].
 */
public class ValidParenthesisString {
    public boolean checkValidString(String s) {
        int left = 0;

        for (int i = 0; i < s.length(); ++i) {
            char charAtI = s.charAt(i);

            if (charAtI == '(' || charAtI == '*') {
                ++left;
            } else {
                --left;
            }

            if (left < 0) {
                return false;
            }
        }

        if (left == 0) {
            return true;
        }

        int right = 0;

        for (int i = s.length() - 1; i >= 0; --i) {
            char charAtI = s.charAt(i);

            if (charAtI == ')' || charAtI == '*') {
                ++right;
            } else {
                --right;
            }

            if (right < 0) {
                return false;
            }
        }

        return true;
    }
}
