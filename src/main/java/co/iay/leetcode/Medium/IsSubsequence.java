package co.iay.leetcode.Medium;

/**
 * Created by ng on 16/9/9.
 */
public class IsSubSequence {
    public boolean isSubsequence(String s, String t) {
        /*
        int[] sCount = new int[26];
        int[] tCount = new int[26];

        for (int i = 0; i < sCount.length; ++i) {
            sCount[0] = 0;
            tCount[0] = 0;
        }

        HashMap<String, ArrayList<Integer>> sList = new HashMap<String, ArrayList<Integer>>();

        for (int i = 0; i < s.length(); ++i) {
            char sc = s.charAt(i);

            if (!sList.containsKey(sc + "")) {
                sList.put(sc + "", new ArrayList<Integer>());
            }

            sList.get(sc + "").add(i);
            ++sCount[sc - 'a'];
        }

        HashMap<String, ArrayList<Integer>> tList = new HashMap<String, ArrayList<Integer>>();
        HashMap<String, Boolean> ignoredList = new HashMap<String, Boolean>();

        for (int i = 0; i < t.length(); ++i) {
            char tc = t.charAt(i);

            if (ignoredList.containsKey(tc + "")) {
                continue;
            }

            if (!tList.containsKey(tc + "")) {
                tList.put(tc + "", new ArrayList<Integer>());
            }

            tList.get(tc + "").add(i);

            if (sList.containsKey(tc + "") && i < sList.get(tc + "").get(tList.get(tc + "").size() - 1)) {
                return false;
            }

            ++tCount[tc - 'a'];

            if (tCount[tc - 'a'] > 0 && tCount[tc - 'a'] == sCount[tc - 'a']) {
                ignoredList.put(tc + "", true);
            }
        }

        for (int i = 0; i < sCount.length; ++i) {
            if (sCount[i] > tCount[i]) {
                return false;
            }
        }

        return true;
        */
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
