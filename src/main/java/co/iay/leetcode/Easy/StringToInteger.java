package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/6/3.
 * https://leetcode.com/problems/string-to-integer-atoi/
 */
public class StringToInteger {
    public int myAtoi(String str) {
        int result = 0;
        int factor = 1;
        boolean notZero = false;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);

            if (c >= '0' && c <= '9') {
                sb.append(c);
                notZero = true;
            } else if ((!notZero || i == 0) && c == '-') {
                factor = -1;
                notZero = true;
            } else if ((!notZero || i == 0) && c == '+') {
                factor = 1;
                notZero = true;
            } else if (!notZero && (c == ' ' || c == '0')) {
                continue;
            } else {
                break;
            }
        }

        str = sb.toString();

        if (str.length() > 10) {
            return factor == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        int pos = 0;

        for (int i = str.length() - 1; i >= 0; --i) {
            ++pos;
            int nowNum = str.charAt(i) - '0';

            if (pos == 10) {
                if (nowNum >= 2) {
                    if (factor == 1 && result >= 147483647) {
                        return Integer.MAX_VALUE;
                    } else if (factor == -1 && result <= -147483648) {
                        return Integer.MIN_VALUE;
                    }
                }
            }

            result = result + factor * nowNum * (int)Math.pow(10, pos - 1);
        }

        return result;
    }
}
