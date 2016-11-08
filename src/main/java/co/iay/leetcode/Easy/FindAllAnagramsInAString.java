package co.iay.leetcode.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by ng on 16/11/8.
 */
public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<Integer>();

        if (s.length() < p.length()) {
            return result;
        }

        HashMap<String, Boolean> pMap = new HashMap<String, Boolean>();

        for (int i = 0; i < p.length(); ++i) {
            pMap.put(p.charAt(i) + "", true);
        }

        for (int i = 0; i < s.length() - p.length() + 1; ++i) {
            String sChar = s.charAt(i) + "";

            if (!pMap.containsKey(sChar)) {
                continue;
            }

            HashMap<String, Boolean> tpMap = new HashMap<String, Boolean>();

            for (int j = i; j < i + p.length(); ++j) {
                String jChar = s.charAt(j) + "";

                if (pMap.containsKey(jChar)) {
                    tpMap.put(jChar, true);
                }
            }

            if (tpMap.keySet().size() == pMap.keySet().size()) {
                result.add(i);
            }
        }

        return result;
    }
}
