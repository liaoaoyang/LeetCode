package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/10/5.
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] chars = new int[52];

        for (int i = 0; i < chars.length; ++i) {
            chars[i] = 0;
        }

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            ++chars[(Character.isUpperCase(c) ? (c - 'A' + 26) : c - 'a')];
        }

        int maxFreq = 0;
        int maxFreqChar = -1;

        for (int i = 0; i < chars.length; ++i) {
            if (chars[i] > maxFreq && chars[i] % 2 == 1) {
                maxFreq = chars[i];
                maxFreqChar = i;
            }
        }

        int result = 0;

        for (int i = 0; i < chars.length; ++i) {
            if (i == maxFreqChar) {
                result += chars[i];
            } else {
                if (chars[i] % 2 == 0) {
                    result += chars[i];
                } else {
                    result += (chars[i] - 1);
                }
            }
        }

        return result;
    }
}
