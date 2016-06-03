package co.iay.leetcode.Easy;

import java.util.HashMap;

/**
 * Created by ng on 16/5/29.
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        int prev = 0;
        int result = 0;
        HashMap<String, Integer> romanIntMap = new HashMap<String, Integer>();
        romanIntMap.put("I", 1);
        romanIntMap.put("V", 5);
        romanIntMap.put("X", 10);
        romanIntMap.put("L", 50);
        romanIntMap.put("C", 100);
        romanIntMap.put("D", 500);
        romanIntMap.put("M", 1000);

        if (s.length() == 1) {
            return romanIntMap.get(s);
        }

        for(int i = s.length() - 1; i >= 0; --i) {
            String now = s.substring(i, i + 1);
            int nowNum = romanIntMap.get(now);

            if (prev > nowNum) {
                result = result - nowNum;
            } else {
                result += nowNum;
            }

            prev = nowNum;
        }

        return result;
    }
}
