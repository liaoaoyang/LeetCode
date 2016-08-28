package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/8/28.
 */
public class FirstUniqueCharacterInAString {
    private static int LEN = 256;

    public int firstUniqChar(String s) {
        int[] count = new int[LEN];
        int[] pos = new int[LEN];

        for (int i = 0; i < LEN; ++i) {
            count[i] = 0;
            pos[i] = -1;
        }

        for (int i = 0; i < s.length(); ++i) {
            ++count[s.charAt(i)];

            if (pos[s.charAt(i)] == -1) {
                pos[s.charAt(i)] = i;
            }
        }

        int minPos = Integer.MAX_VALUE;

        for (int i = 0; i < LEN; ++i) {
            if (count[i] == 1 && pos[i] >= 0 && minPos > pos[i]) {
                minPos = pos[i];
            }
        }

        return minPos == Integer.MAX_VALUE ? -1 : minPos;
    }
}
