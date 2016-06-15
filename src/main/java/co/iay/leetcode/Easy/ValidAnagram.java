package co.iay.leetcode.Easy;

import java.util.Arrays;

/**
 * Created by ng on 16/6/15.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        Arrays.sort(sChars);
        String sSorted = new String(sChars);

        char[] tChars = t.toCharArray();
        Arrays.sort(tChars);
        String tSorted = new String(tChars);

        return  sSorted.equals(tSorted);
    }
}
