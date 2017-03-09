package co.iay.leetcode.Easy;

/**
 * Created by ng on 17/3/9.
 * 205. Isomorphic Strings
 * https://leetcode.com/problems/isomorphic-strings
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] replacement = new char[257];
        char[] replacementB = new char[257];

        for (int i = 0; i < s.length(); ++i) {
            if (replacement[s.charAt(i)] == 0) {
                replacement[s.charAt(i)] = t.charAt(i);
            }

            if (replacementB[t.charAt(i)] == 0) {
                replacementB[t.charAt(i)] = s.charAt(i);
            }

            if (replacement[s.charAt(i)] != t.charAt(i)) {
                return false;
            }

            if (replacementB[t.charAt(i)] != s.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
