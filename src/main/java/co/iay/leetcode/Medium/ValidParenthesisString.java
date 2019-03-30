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
 * Solution:
 * 前提1：*可以是任意括号或者空字符串
 * 前提2：)(是没有意义的
 * <p>
 * 将*视为左括号，从左向右，当计数器小于0时，说明出现了括号不匹配的情况。
 * 遍历完成后，当计数器为0，则说明确实完成了所有的匹配。
 * 计数器不为0因为无法得知到底是括号还是*剩余，所以能成为判定依据。
 * <p>
 * 将*视为右括号，从右向左，当计数器小于0时，说明出现了括号不匹配的情况。
 * 核心在于如下思考：
 * 当从右向左遍历的计数器结果为0时，必然是括号匹配。
 * 然而当大于0时，说明右括号比较多，从左向右遍历时因为*都当做(处理，
 * 从右向左时只会存在实际的(，如果出现了"右括号"剩余的情况，那么必然是
 * *变成的右括号，因为如果是真实的右括号更多的话，从左向右遍历的过程中会出现无法匹配的情况。
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
