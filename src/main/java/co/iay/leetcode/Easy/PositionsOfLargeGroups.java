package co.iay.leetcode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 830. Positions of Large Groups
 * https://leetcode.com/problems/positions-of-large-groups/
 * In a string S of lowercase letters, these letters form consecutive groups of the same character.
 * <p>
 * For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".
 * <p>
 * Call a group large if it has 3 or more characters.  We would like the starting and ending positions of every large group.
 * <p>
 * The final answer should be in lexicographic order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: "abbxxxxzzy"
 * Output: [[3,6]]
 * Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
 * Example 2:
 * <p>
 * Input: "abc"
 * Output: []
 * Explanation: We have "a","b" and "c" but no large group.
 * Example 3:
 * <p>
 * Input: "abcdddeeeeaabbbcd"
 * Output: [[3,5],[6,9],[12,14]]
 * <p>
 * <p>
 * Note:  1 <= S.length <= 1000
 */
public class PositionsOfLargeGroups {
    public List<List<Integer>> largeGroupPositions(String S) {
        char prevC = ' ';
        int prevStart = 0;

        char[] sc = S.toCharArray();
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < sc.length; ++i) {
            if (prevC != sc[i]) {

                if (i - prevStart >= 3) {
                    result.add(Arrays.asList(prevStart, i - 1));
                }

                prevStart = i;
            }

            prevC = sc[i];
        }

        if (sc.length - prevStart >= 3) {
            result.add(Arrays.asList(prevStart, sc.length - 1));
        }

        return result;
    }
}
