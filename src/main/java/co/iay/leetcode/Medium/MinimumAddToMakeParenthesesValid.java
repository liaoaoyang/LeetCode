package co.iay.leetcode.Medium;

import java.util.Stack;

/**
 * 921. Minimum Add to Make Parentheses Valid
 * https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
 * Given a string S of '(' and ')' parentheses,
 * we add the minimum number of parentheses ( '(' or ')', and in any positions )
 * so that the resulting parentheses string is valid.
 * <p>
 * Formally, a parentheses string is valid if and only if:
 * <p>
 * It is the empty string, or
 * It can be written as AB (A concatenated with B), where A and B are valid strings, or
 * It can be written as (A), where A is a valid string.
 * Given a parentheses string, return the minimum number of parentheses we must add to make the resulting string valid.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: "())"
 * Output: 1
 * Example 2:
 * <p>
 * Input: "((("
 * Output: 3
 * Example 3:
 * <p>
 * Input: "()"
 * Output: 0
 * Example 4:
 * <p>
 * Input: "()))(("
 * Output: 4
 * <p>
 * <p>
 * Note:
 * <p>
 * S.length <= 1000
 * S only consists of '(' and ')' characters.
 */
public class MinimumAddToMakeParenthesesValid {
    public int minAddToMakeValid(String S) {
        Stack<Character> ss = new Stack<>();
        int result = 0;

        for (int i = 0; i < S.length(); ++i) {
            char charAtI = S.charAt(i);

            if (charAtI == '(') {
                ss.push(charAtI);
                continue;
            }

            if (ss.empty()) {
                ++result;
                continue;
            }

            ss.pop();
        }

        return result + ss.size();
    }
}
