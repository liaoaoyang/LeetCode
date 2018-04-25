package co.iay.leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 821. Shortest Distance to a Character
 * https://leetcode.com/problems/shortest-distance-to-a-character/
 * Given a string S and a character C, return an array of integers
 * representing the shortest distance from the character C in the string.
 * <p>
 * Example 1:
 * <p>
 * Input: S = "loveleetcode", C = 'e'
 * Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 * <p>
 * <p>
 * Note:
 * <p>
 * S string length is in [1, 10000].
 * C is a single character, and guaranteed to be in string S.
 * All letters in S and C are lowercase.
 */
public class ShortestDistanceToACharacter {
    public int[] shortestToChar(String S, char C) {
        int[] result = new int[S.length()];
        List<Integer> pos = new ArrayList<>();

        for (int i = 0; i < result.length; ++i) {
            if (S.charAt(i) == C) {
                pos.add(i);
            }
        }

        List<Integer> posFromRight = new ArrayList<>(pos);

        for (int i = 0; i < result.length; ++i) {
            if (pos.size() == 1) {
                result[i] = Math.abs(pos.get(0) - i);
                continue;
            }

            if (i < pos.get(0)) {
                result[i] = pos.get(0) - i;
            } else {
                pos.remove(0);
                result[i] = 0;
            }
        }

        for (int i = result.length - 1; i >= 0; --i) {
            if (posFromRight.size() == 1) {
                result[i] = Math.min(Math.abs(posFromRight.get(posFromRight.size() - 1) - i), result[i]);
                continue;
            }

            int lastIndex = posFromRight.size() - 1;

            if (i > posFromRight.get(lastIndex)) {
                result[i] = Math.min(Math.abs(posFromRight.get(lastIndex) - i), result[i]);
            } else {
                posFromRight.remove(lastIndex);
                result[i] = 0;
            }
        }

        return result;
    }
}
