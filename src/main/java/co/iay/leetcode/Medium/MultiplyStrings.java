package co.iay.leetcode.Medium;

/**
 * Created by ng on 2017/7/10.
 * 43. Multiply Strings
 * https://leetcode.com/problems/multiply-strings/
 */
public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        StringBuilder sb = new StringBuilder(num1);
        char[] revNum1 = sb.reverse().toString().toCharArray();
        sb = new StringBuilder(num2);
        char[] revNum2 = sb.reverse().toString().toCharArray();
        char[] revResult = new char[revNum1.length + revNum2.length];
        int addBeginIndex = 0;

        for (int i = 0; i < revResult.length; ++i) {
            revResult[i] = '0';
        }

        int addition = 0;

        for (int i = 0; i < revNum1.length; ++i, ++addBeginIndex) {
            if ('0' == revNum1[i]) {
                continue;
            }

            char[] revNum2Xi = new char[revNum2.length + 1];
            addition = 0;

            for (char j = 0; j < revNum2.length; ++j) {
                int now = (revNum1[i] - '0') * (revNum2[j] - '0') + addition;
                revNum2Xi[j] = (char) (now % 10 + '0');
                addition = now / 10;
            }

            if (addition >= 0) {
                revNum2Xi[revNum2Xi.length - 1] = (char) (addition + '0');
            }

            // add to result
            addition = 0;

            for (int k = 0; k < revNum2Xi.length; ++k) {
                int now = (revNum2Xi[k] - '0') + (revResult[k + addBeginIndex] - '0') + addition;
                revResult[k + addBeginIndex] = (char) (now % 10 + '0');
                addition = now / 10;
            }
        }

        if (addition > 0) {
            revResult[revResult.length - 1] = (char) (addition + '0');
        }

        sb = new StringBuilder();
        String result = sb.append(revResult).reverse().toString();

        int start = 0;

        for (; start < result.length(); ++start) {
            if (result.charAt(start) != '0') {
                break;
            }
        }

        return start == result.length() ? "0" : result.substring(start);
    }
}
