package co.iay.leetcode.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 893. Groups of Special-Equivalent Strings
 * https://leetcode.com/problems/groups-of-special-equivalent-strings/
 * You are given an array A of strings.
 * <p>
 * Two strings S and T are special-equivalent if after any number of moves,
 * S == T.
 * <p>
 * A move consists of choosing two indices i and j with i % 2 == j % 2,
 * and swapping S[i] with S[j].
 * <p>
 * Now, a group of special-equivalent strings from A is a non-empty subset S of A
 * such that any string not in S is not special-equivalent with any string in S.
 * <p>
 * Return the number of groups of special-equivalent strings from A.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: ["a","b","c","a","c","c"]
 * Output: 3
 * Explanation: 3 groups ["a","a"], ["b"], ["c","c","c"]
 * Example 2:
 * <p>
 * Input: ["aa","bb","ab","ba"]
 * Output: 4
 * Explanation: 4 groups ["aa"], ["bb"], ["ab"], ["ba"]
 * Example 3:
 * <p>
 * Input: ["abc","acb","bac","bca","cab","cba"]
 * Output: 3
 * Explanation: 3 groups ["abc","cba"], ["acb","bca"], ["bac","cab"]
 * Example 4:
 * <p>
 * Input: ["abcd","cdab","adcb","cbad"]
 * Output: 1
 * Explanation: 1 group ["abcd","cdab","adcb","cbad"]
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 1000
 * 1 <= A[i].length <= 20
 * All A[i] have the same length.
 * All A[i] consist of only lowercase letters.
 */
public class GroupsOfSpecialEquivalentStrings {
    private String getPattern(String str) {
        StringBuilder sb = new StringBuilder();
        int[] oddCounter = new int[26];
        int[] evenCounter = new int[26];

        for (int i = 0; i < str.length(); ++i) {
            if ((i + 1) % 2 == 1) {
                oddCounter[str.charAt(i) - 'a']++;
            } else {
                evenCounter[str.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < oddCounter.length; ++i) {
            if (oddCounter[i] == 0) {
                continue;
            }

            sb.append((char) (i + 'a'));
            sb.append(oddCounter[i]);
        }

        sb.append('|');

        for (int i = 0; i < evenCounter.length; ++i) {
            if (evenCounter[i] == 0) {
                continue;
            }

            sb.append((char) (i + 'a'));
            sb.append(evenCounter[i]);
        }

        return sb.toString();
    }

    public int numSpecialEquivGroups(String[] A) {
        Map<String, Integer> groups = new HashMap<>();

        for (String a : A) {
            groups.putIfAbsent(getPattern(a), 1);
        }

        return groups.size();
    }
}
