package co.iay.leetcode.Easy;

/**
 * Created by ng on 17/1/29.
 */
public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String str) {
        int maxStrLen = str.length() / 2;
        int strLen = str.length();

        for (int i = 1; i <= maxStrLen; ++i) {
            if (strLen % i != 0) {
                continue;
            }

            int repeatTimes = strLen / i;
            StringBuilder sb = new StringBuilder();
            String firstNChars = str.substring(0, i);

            for (int j = 0; j < repeatTimes; ++j) {
                sb.append(firstNChars);
            }

            if (sb.toString().equals(str)) {
                return true;
            }
        }

        return false;
    }
}
