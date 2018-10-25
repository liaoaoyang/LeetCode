package co.iay.leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 856. Score of Parentheses
 * https://leetcode.com/problems/score-of-parentheses/
 * Given a balanced parentheses string S, compute the score of the string based on the following rule:
 * <p>
 * () has score 1
 * AB has score A + B, where A and B are balanced parentheses strings.
 * (A) has score 2 * A, where A is a balanced parentheses string.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: "()"
 * Output: 1
 * Example 2:
 * <p>
 * Input: "(())"
 * Output: 2
 * Example 3:
 * <p>
 * Input: "()()"
 * Output: 2
 * Example 4:
 * <p>
 * Input: "(()(()))"
 * Output: 6
 * <p>
 * <p>
 * Note:
 * <p>
 * S is a balanced parentheses string, containing only ( and ).
 * 2 <= S.length <= 50
 */
public class ScoreOfParentheses {
    private boolean isParentheses(int i) {
        return i == '(' || i == ')';
    }

    public int scoreOfParentheses(String S) {
        List<Integer> sl = new ArrayList<>(S.length());

        for (int i = 0; i < S.length(); ++i) {
            sl.add((int) S.charAt(i));
        }

        int length = S.length() - 1;

        for (int i = 0; i < length; ++i) {
            if (!isParentheses(sl.get(i))) {
                continue;
            }

            if (sl.get(i) == (')')) {
                continue;
            }

            if (sl.get(i) == '(' && sl.get(i + 1) == ')') {
                sl.set(i, -1);
                sl.remove(i + 1);
                --length;
            }
        }

        while (true) {
            int slLength = sl.size() - 2;
            boolean foundParentheses = false;

            for (int i = 0; i < slLength; ++i) {
                if (isParentheses(sl.get(i))) {
                    foundParentheses = true;
                }

                if (sl.get(i) == '(' &&
                        (sl.get(i + 1) != '(' && sl.get(i + 1) != ')') &&
                        sl.get(i + 2) == ')') {
                    sl.set(i, 2 * sl.get(i + 1));
                    sl.remove(i + 1);
                    sl.remove(i + 1);
                    slLength -= 2;
                }
            }

            slLength = sl.size();

            for (int i = 0; i < slLength - 1; ++i) {
                if (!isParentheses(sl.get(i)) && !isParentheses(sl.get(i + 1))) {
                    sl.set(i + 1, sl.get(i) + sl.get(i + 1));
                    sl.remove(i);
                    --i;
                    --slLength;
                }
            }

            if (!foundParentheses) {
                break;
            }
        }

        return sl.get(0) * -1;
    }
}
