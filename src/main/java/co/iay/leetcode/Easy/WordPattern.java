package co.iay.leetcode.Easy;

import java.util.HashMap;

/**
 * Created by ng on 16/6/6.
 * https://leetcode.com/problems/word-pattern/
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split(" ");

        if (pattern.length() != strs.length) {
            return false;
        }

        HashMap<String, String> charStringMap = new HashMap<String, String>();
        HashMap<String, String> stringCharMap = new HashMap<String, String>();

        for (int i = 0; i < pattern.length(); ++i) {
            String now = pattern.substring(i, i + 1);
            String nowStr = strs[i];

            if (charStringMap.containsKey(now)) {
                if (!charStringMap.get(now).equals(nowStr)) {
                    return false;
                }
            } else {
                charStringMap.put(now, nowStr);
            }

            if (stringCharMap.containsKey(nowStr)) {
                if (!stringCharMap.get(nowStr).equals(now)) {
                    return false;
                }
            } else {
                stringCharMap.put(nowStr, now);
            }
        }

        return true;
    }
}
