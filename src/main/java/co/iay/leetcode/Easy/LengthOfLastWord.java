package co.iay.leetcode.Easy;

/**
 * Created by aoyang on 16/5/6.
 * https://leetcode.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        boolean canCount = false;
        int len = 0;

        for (int i = s.length() - 1; i >= 0; --i) {
            if (s.substring(i, i + 1).equals(" ")) {
                if (canCount) {
                    return len;
                }
            } else {
                if (!canCount) {
                    canCount = true;
                }

                ++len;
            }
        }

        return len;
    }
}
