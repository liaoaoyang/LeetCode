package co.iay.leetcode.Easy;

import java.util.HashMap;

/**
 * Created by ng on 16/8/12.
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<String, Integer> r = new HashMap<String, Integer>();
        HashMap<String, Integer> m = new HashMap<String, Integer>();

        for (int i = 0; i < ransomNote.length(); ++i) {
            String rn = ransomNote.charAt(i) + "";

            if (r.containsKey(rn)) {
                r.put(rn, r.get(rn) + 1);
            } else {
                r.put(rn, 1);
            }
        }

        for (int i = 0; i < magazine.length(); ++i) {
            String mz = magazine.charAt(i) + "";

            if (m.containsKey(mz)) {
                m.put(mz, m.get(mz) + 1);
            } else {
                m.put(mz, 1);
            }
        }

        for (String k : r.keySet()) {
            if (!m.containsKey(k)) {
                return false;
            }

            if (m.get(k) < r.get(k)) {
                return false;
            }
        }

        return true;
    }
}
