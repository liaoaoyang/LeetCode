package co.iay.leetcode.Medium;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 791. Custom Sort String
 * https://leetcode.com/problems/custom-sort-string/
 * <p>
 * S and T are strings composed of lowercase letters. In S, no letter occurs more than once.
 * <p>
 * S was sorted in some custom order previously.
 * We want to permute the characters of T so that they match the order that S was sorted.
 * More specifically, if x occurs before y in S, then x should occur before y in the returned string.
 * <p>
 * Return any permutation of T (as a string) that satisfies this property.
 * <p>
 * Example :
 * Input:
 * S = "cba"
 * T = "abcd"
 * Output: "cbad"
 * Explanation:
 * "a", "b", "c" appear in S, so the order of "a", "b", "c" should be "c", "b", and "a".
 * Since "d" does not appear in S, it can be at any position in T. "dcba", "cdba", "cbda"
 * are also valid outputs.
 * <p>
 * <p>
 * Note:
 * <p>
 * S has length at most 26, and no character is repeated in S.
 * T has length at most 200.
 * S and T consist of lowercase letters only.
 * Solution:
 * 首先按照S中的字符出现的顺序对字符进行统计，之后遍历带顺序的存储结构，构建结果。
 * 这里为了能让HashMap按加入顺序输出，会选择LinkedHashMap结构。
 */
public class CustomSortString {
    public String customSortString(String S, String T) {
        StringBuilder sb = new StringBuilder();
        LinkedHashMap<Character, Integer> m = new LinkedHashMap<>();

        for (char c : S.toCharArray()) {
            if (!m.containsKey(c)) {
                m.put(c, 0);
            }
        }

        for (char c : T.toCharArray()) {
            if (!m.containsKey(c)) {
                m.put(c, 1);
                continue;
            }

            m.put(c, m.get(c) + 1);
        }

        for (Map.Entry<Character, Integer> e : m.entrySet()) {
            for (int i = 0; i < e.getValue(); ++i) {
                sb.append(e.getKey());
            }
        }

        return sb.toString();
    }
}
