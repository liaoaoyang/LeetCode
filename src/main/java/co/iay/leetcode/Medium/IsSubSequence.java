package co.iay.leetcode.Medium;

/**
 * Created by ng on 16/9/9.
 */
public class IsSubSequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        if (s.length() == 0) {
            return true;
        }

        for (; i < s.length() && j < t.length();) {
            char sc = s.charAt(i);

            for (; j < t.length(); ++j) {
                if (sc == t.charAt(j)) {
                    if (i == s.length() - 1) {
                        return true;
                    }

                    ++i;
                    ++j;
                    break;
                }
            }
        }

        return false;
    }
}
