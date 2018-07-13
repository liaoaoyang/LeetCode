package co.iay.leetcode.Medium;

import java.util.List;

/**
 * 524. Longest Word in Dictionary through Deleting
 * https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/
 * Given a string and a string dictionary,
 * find the longest string in the dictionary that can be formed
 * by deleting some characters of the given string.
 * If there are more than one possible results,
 * return the longest word with the smallest lexicographical order.
 * If there is no possible result, return the empty string.
 * <p>
 * Example 1:
 * Input:
 * s = "abpcplea", d = ["ale","apple","monkey","plea"]
 * <p>
 * Output:
 * "apple"
 * Example 2:
 * Input:
 * s = "abpcplea", d = ["a","b","c"]
 * <p>
 * Output:
 * "a"
 * Note:
 * All the strings in the input will only contain lower-case letters.
 * The size of the dictionary won't exceed 1,000.
 * The length of all the strings in the input won't exceed 1,000.
 */
public class LongestWordInDictionaryThroughDeleting {
    public String findLongestWord(String s, List<String> d) {
        d.sort((o1, o2) -> {
            if (o1.length() > o2.length()) {
                return -1;
            } else if (o1.length() < o2.length()) {
                return 1;
            }

            return o1.compareTo(o2);
        });

        for (String di : d) {
            int length = 0;

            for (int i = 0; i < s.length() && length < di.length(); ++i) {
                if (s.charAt(i) == di.charAt(length)) {
                    ++length;
                }
            }

            if (length == di.length()) {
                return di;
            }

        }

        return "";
    }
}
