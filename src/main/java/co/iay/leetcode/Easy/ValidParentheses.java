package co.iay.leetcode.Easy;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by ng on 16/4/24.
 * 20. Valid Parentheses
 * https://leetcode.com/problems/valid-parentheses/
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * <p>
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid
 * but "(]" and "([)]" are not.
 * <p>
 * Solution:
 * 使用栈可以处理。
 * 对于左括号全部入栈，右括号到来时，查看栈顶是否有对应的左括号，如果栈为空或者不存在对应的左括号，
 * 则匹配失败；反之，则将对应字符出栈。
 * 在检测完成之后，如果栈不为空，说明没有足够的右括号，匹配失败。
 * 递归也可以解决，但是可能会栈溢出。
 */
public class ValidParentheses {
    HashMap<Character, Character> parenthesesMap = new HashMap<Character, Character>();

    @SuppressWarnings("unused")
    private boolean oldSolution(String s) {
        String p = "";

        for (int i = 0; i < s.length(); ++i) {
            String c = s.substring(i, i + 1);

            if ("([{".contains(c)) {
                p = p + c;
                continue;
            }

            if (")]}".contains(c)) {
                if (p.length() == 0) {
                    return false;
                }

                String topOfStack = p.substring(p.length() - 1, p.length());

                if (c.equals(")") && !topOfStack.equals("(")) {
                    return false;
                }

                if (c.equals("]") && !topOfStack.equals("[")) {
                    return false;
                }

                if (c.equals("}") && !topOfStack.equals("{")) {
                    return false;
                }

                p = p.substring(0, p.length() - 1);
            }
        }

        return p.length() == 0;
    }

    @SuppressWarnings("unused")
    private boolean stackSolution(String s) {
        Stack<Character> ss = new Stack<Character>();
        char[] sc = s.toCharArray();

        for (char sci : sc) {
            if ("([{".contains(sci + "")) {
                ss.push(sci);
            } else if (ss.size() > 0) {
                if (ss.peek() != parenthesesMap.get(sci)) {
                    return false;
                }

                ss.pop();
            } else {
                return false;
            }
        }

        return ss.empty();
    }

    @SuppressWarnings("unused")
    private boolean recursiveSolution(String s, int idx, String stack) {
        if (idx == s.length()) {
            return stack.length() == 0;
        }

        char now = s.substring(idx, idx + 1).toCharArray()[0];

        if ("([{".contains(now + "")) {
            return recursiveSolution(s, idx + 1, now + stack);
        } else if (stack.length() > 0) {
            if (stack.substring(0, 1).equals(parenthesesMap.get(now) + "")) {
                return recursiveSolution(s, idx + 1, stack.substring(1));
            }

            return false;
        } else {
            return false;
        }
    }

    private void initParenthesesMap() {
        if (parenthesesMap == null) {
            return;
        }

        parenthesesMap.clear();
        parenthesesMap.put(')', '(');
        parenthesesMap.put(']', '[');
        parenthesesMap.put('}', '{');
    }

    public boolean isValid(String s) {
        initParenthesesMap();
        //return recursiveSolution(s, 0, "");
        return stackSolution(s);
    }
}
