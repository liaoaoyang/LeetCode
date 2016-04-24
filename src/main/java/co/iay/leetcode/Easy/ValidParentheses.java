package co.iay.leetcode.Easy;

import java.util.Stack;

/**
 * Created by ng on 16/4/24.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<String> parenthesesStack = new Stack<String>();

        for (int i = 0; i < s.length(); ++i) {
            String c = s.substring(i, i + 1);

            if ("([{".contains(c)) {
                parenthesesStack.push(c);
                continue;
            }

            if (")]}".contains(c)) {
                String topOfStack = parenthesesStack.peek();

                if (c.equals(")") && !topOfStack.equals("(")) {
                    return false;
                }

                if (c.equals("]") && !topOfStack.equals("[")) {
                    return false;
                }

                if (c.equals("}") && !topOfStack.equals("{")) {
                    return false;
                }

                parenthesesStack.pop();
            }
        }

        return parenthesesStack.size() == 0;
    }
}
