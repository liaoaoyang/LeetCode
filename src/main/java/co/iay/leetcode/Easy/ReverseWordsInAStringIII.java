package co.iay.leetcode.Easy;

/**
 * Created by ng on 17/4/22.
 * 557. Reverse Words in a String III
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */
public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        char[] cs = (s + " ").toCharArray();
        char[] rcs = new char[s.length() + 1];

        int p = 0;
        int pp = 0;

        for (int i = 0; i < cs.length; ++i) {
            if (cs[i] == ' ') {
                rcs[i] = ' ';
                pp = p;
                p = i;

                if (p >= 0 && 0 <= pp && p - pp >= 1) {
                    for (int j = p - 1, k = (pp == 0 ? 0 : pp + 1); j >= pp; --j, ++k) {
                        rcs[k] = cs[j];
                    }
                }
            }
        }

        return new String(rcs).substring(0, rcs.length - 1);
    }
}
