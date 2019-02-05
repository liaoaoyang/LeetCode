package co.iay.leetcode.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 953. Verifying an Alien Dictionary
 * https://leetcode.com/problems/verifying-an-alien-dictionary/
 * <p>
 * In an alien language, surprisingly they also use english lowercase letters,
 * but possibly in a different order.
 * The order of the alphabet is some permutation of lowercase letters.
 * <p>
 * Given a sequence of words written in the alien language, and the order of the alphabet,
 * return true if and only if the given words are sorted lexicographicaly in this alien language.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
 * Output: true
 * Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
 * Example 2:
 * <p>
 * Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
 * Output: false
 * Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1],
 * hence the sequence is unsorted.
 * Example 3:
 * <p>
 * Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
 * Output: false
 * Explanation: The first three characters "app" match,
 * and the second string is shorter (in size.)
 * According to lexicographical rules "apple" > "app", because 'l' > '∅',
 * where '∅' is defined as the blank character which is less than any other character (More info).
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= words.length <= 100
 * 1 <= words[i].length <= 20
 * order.length == 26
 * All characters in words[i] and order are english lowercase letters.
 */
public class VerifyingAnAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> om = new HashMap<>();

        for (int i = 0; i < order.length(); ++i) {
            om.put(order.charAt(i), i);
        }

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < words.length - 1; ++i) {
            sb1.setLength(0);
            sb2.setLength(0);

            int wordLen = words[i].length() < words[i + 1].length() ?
                    words[i].length() :
                    words[i + 1].length();

            for (int j = 0; j < wordLen; ++j) {
                sb1.append((char) (om.get(words[i].charAt(j)) + 'a'));
            }

            for (int j = 0; j < wordLen; ++j) {
                sb2.append((char) (om.get(words[i + 1].charAt(j)) + 'a'));
            }

            if (sb1.toString().compareTo(sb2.toString()) > 0) {
                return false;
            }

            if (sb1.toString().compareTo(sb2.toString()) == 0 &&
                    words[i].length() > words[i + 1].length()) {
                return false;
            }
        }

        return true;
    }
}
