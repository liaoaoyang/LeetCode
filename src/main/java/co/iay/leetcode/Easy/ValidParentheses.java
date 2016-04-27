package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/4/24.
 * https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses {
    public boolean isValid(String s) {
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
}
