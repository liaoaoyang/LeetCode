package co.iay.leetcode.Easy;

/**
 * Created by ng on 17/4/8.
 * 28. Implement strStr()
 * https://leetcode.com/problems/implement-strstr
 */
public class ImplementStrStr {
    private int normalCompare(String haystack, String needle) {
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();

        for (int i = 0; i <= h.length - n.length; ++i) {
            int j = 0;

            for (int k = i; j < n.length && h[k] == n[j]; ++j, ++k) {
            }

            if (j == n.length) {
                return i;
            }
        }

        return -1;
    }

    public int strStr(String haystack, String needle) {
        return normalCompare(haystack, needle);
    }
}
