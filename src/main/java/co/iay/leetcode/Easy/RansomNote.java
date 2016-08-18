package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/8/12.
 * https://leetcode.com/problems/ransom-note/
 */
public class RansomNote {
    private static final int COUNTER_LENGTH = 256;

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] rCounter = new int[COUNTER_LENGTH];
        int[] mCounter = new int[COUNTER_LENGTH];

        for(int i = 0; i < COUNTER_LENGTH; ++i) {
            rCounter[i] = 0;
            mCounter[i] = 0;
        }

        for (int i = 0; i < ransomNote.length(); ++i) {
            rCounter[ransomNote.charAt(i) - '0']++;
        }

        for (int i = 0; i < magazine.length(); ++i) {
            mCounter[magazine.charAt(i) - '0']++;
        }

        for (int i = 0; i < COUNTER_LENGTH; ++i) {
            if (mCounter[i] < rCounter[i]) {
                return false;
            }
        }

        return true;
    }
}
