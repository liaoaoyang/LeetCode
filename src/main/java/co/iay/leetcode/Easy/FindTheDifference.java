package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/8/29.
 * https://leetcode.com/problems/find-the-difference
 */
public class FindTheDifference {
     final private static int LEN = 256;

    public char findTheDifference(String s, String t) {
        int[] ss = new int[LEN];
        int[] tt = new int[LEN];

        for (int i = 0; i < LEN; ++i) {
            ss[i] = 0;
            tt[i] = 0;
        }

        for (int i = 0; i < s.length(); ++i) {
            int code = (int)(s.charAt(i) - '\0');

            ++ss[code];
        }

        for (int i = 0; i < t.length(); ++i) {
            int code = (int)(t.charAt(i) - '\0');

            ++tt[code];
        }

        for (int i = 0; i < LEN; ++i) {
            if (ss[i] != tt[i]) {
                return (char)i;
            }
        }

        return '\0';
    }
}
