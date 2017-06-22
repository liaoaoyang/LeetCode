package co.iay.leetcode.Hard;

import java.util.Stack;

/**
 * Created by ng on 17/3/19.
 * 32. Longest Valid Parentheses
 * https://leetcode.com/problems/longest-valid-parentheses/
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        char[] sc = s.toCharArray();

        Stack<Integer> ss = new Stack<Integer>();
        int result = 0;
        int nowMatchedLength = 0;

        for (int i = 0; i < sc.length; ++i) {
            if ('(' == sc[i]) {
                ss.push(i);
                continue;
            }

            if (ss.isEmpty()) {
                nowMatchedLength = 0;
                continue;
            }

            int matchedLength = i - ss.pop() + 1;

            if (ss.isEmpty()) {
                nowMatchedLength += matchedLength;
                matchedLength = nowMatchedLength;
            } else {
                matchedLength = i - ss.peek();
            }

            result = matchedLength > result ? matchedLength : result;
        }

        return result;
    }
}
