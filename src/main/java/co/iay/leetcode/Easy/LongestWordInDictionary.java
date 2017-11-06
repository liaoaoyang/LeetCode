package co.iay.leetcode.Easy;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 720. Longest Word in Dictionary
 * https://leetcode.com/problems/longest-word-in-dictionary/
 * <p>
 * Given a list of strings words representing an English Dictionary, find the longest word in words that can be built one character at a time by other words in words. If there is more than one possible answer, return the longest word with the smallest lexicographical order.
 * <p>
 * If there is no answer, return the empty string.
 * Example 1:
 * Input:
 * words = ["w","wo","wor","worl", "world"]
 * Output: "world"
 * Explanation:
 * The word "world" can be built one character at a time by "w", "wo", "wor", and "worl".
 * Example 2:
 * Input:
 * words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
 * Output: "apple"
 * Explanation:
 * Both "apply" and "apple" can be built from other words in the dictionary. However, "apple" is lexicographically smaller than "apply".
 * Note:
 * <p>
 * All the strings in the input will only contain lowercase letters.
 * The length of words will be in the range [1, 1000].
 * The length of words[i] will be in the range [1, 30].
 * Solution:
 * 首先对字符串数组按字典序进行排序，之后判断当前字符串是否包含前一个字符串并且长度多1。
 * 如果满足条件，则按字典序中的长度规则，判定是否是合理的结果。
 * 这里使用了集合来记录已经符合规则字符串，首先会加入一个空串，用于判断单字符的情况，
 * 因为单字符只能包含空串。
 */
public class LongestWordInDictionary {
    public String longestWord(String[] words) {
        if (null == words || words.length == 0) {
            return "";
        }

        Arrays.sort(words);
        HashSet<String> s = new HashSet<String>();
        String result = "";
        s.add(result);

        for (String word : words) {
            String wordIWithoutLastChar = word.substring(0, word.length() - 1);
            if (!s.contains(wordIWithoutLastChar)) {
                continue;
            }

            s.add(word);

            if (word.length() > result.length()) {
                result = word;
            }
        }

        return result;
    }
}
