package co.iay.leetcode.Easy;

import java.util.Arrays;

/**
 * Created by ng on 16/12/28.
 */
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int counter = 0;
        int nextMatched = 0;

        for (int i = 0; i < g.length; ++i) {
            for (int j = nextMatched; j < s.length; ++j) {
                if (g[i] <= s[j]) {
                    ++counter;
                    nextMatched = j + 1;
                    break;
                }
            }
        }

        return counter;
    }
}
