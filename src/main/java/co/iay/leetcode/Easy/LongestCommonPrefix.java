package co.iay.leetcode.Easy;

import java.util.HashMap;

/**
 * Created by ng on 16/6/25.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        int shortest = 0;

        for (String s : strs) {
            if (shortest == 0 || shortest > s.length()) {
                shortest = s.length();
            }
        }

        for (int i = shortest; i >= 1; --i) {
            HashMap<String, Integer> m = new HashMap<String, Integer>();

            for (String s : strs) {
                if (s.length() == 0) {
                    continue;
                }

                String c = s.substring(0, i);

                if (!m.containsKey(c)) {
                    m.put(c, 0);
                }

                m.put(c, m.get(c) + 1);

                if (m.get(c) == strs.length) {
                    return c;
                }
            }
        }

        return "";
    }
}
