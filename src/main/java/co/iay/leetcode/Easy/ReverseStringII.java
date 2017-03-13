package co.iay.leetcode.Easy;

/**
 * Created by ng on 17/3/14.
 * 541. Reverse String II
 * https://leetcode.com/problems/reverse-string-ii
 */
public class ReverseStringII {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int sLen = s.length();

        while (i + 2 * k < sLen) {
            StringBuilder tsb = new StringBuilder();
            tsb.append(s.substring(i, i + k)).reverse();
            tsb.append(s.substring(i + k, i + 2 * k));
            sb.append(tsb.toString());
            i += (2 * k);
        }

        int endIdx = Math.min(i + k, sLen);
        StringBuilder tsb = new StringBuilder();
        tsb.append(s.substring(i, endIdx)).reverse();

        if (endIdx < sLen) {
            tsb.append(s.substring(endIdx, sLen));
        }

        sb.append(tsb.toString());

        return sb.toString();
    }
}
