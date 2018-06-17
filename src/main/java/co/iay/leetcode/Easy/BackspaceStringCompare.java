package co.iay.leetcode.Easy;

import java.util.Arrays;
import java.util.Stack;

/**
 * 844. Backspace String Compare
 * https://leetcode.com/problems/backspace-string-compare/
 * Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
 * <p>
 * Example 1:
 * <p>
 * Input: S = "ab#c", T = "ad#c"
 * Output: true
 * Explanation: Both S and T become "ac".
 * Example 2:
 * <p>
 * Input: S = "ab##", T = "c#d#"
 * Output: true
 * Explanation: Both S and T become "".
 * Example 3:
 * <p>
 * Input: S = "a##c", T = "#a#c"
 * Output: true
 * Explanation: Both S and T become "c".
 * Example 4:
 * <p>
 * Input: S = "a#c", T = "b"
 * Output: false
 * Explanation: S becomes "c" while T becomes "b".
 * Note:
 * <p>
 * 1 <= S.length <= 200
 * 1 <= T.length <= 200
 * S and T only contain lowercase letters and '#' characters.
 * Follow up:
 * <p>
 * Can you solve it in O(N) time and O(1) space?
 * Solution:
 * 使用栈解决问题，遇到#号，只要栈不为空，则尝试弹出栈顶的字符，最终的字符串做比对。
 * 这个解法时空复杂度都是O(n)
 */
public class BackspaceStringCompare {
    private String str2stack2str(String S) {
        Stack<Character> ss = new Stack<>();

        for (int i = 0; i < S.length(); ++i) {
            if (S.charAt(i) == '#') {
                if (!ss.isEmpty()) {
                    ss.pop();
                }
                continue;
            }

            ss.push(S.charAt(i));
        }

        return Arrays.toString(ss.toArray());
    }

    public boolean backspaceCompare(String S, String T) {
        return str2stack2str(S).equals(str2stack2str(T));
    }
}
