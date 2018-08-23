package co.iay.leetcode.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 884. Uncommon Words from Two Sentences
 * https://leetcode.com/problems/uncommon-words-from-two-sentences/
 * We are given two sentences A and B.
 * (A sentence is a string of space separated words.
 * Each word consists only of lowercase letters.)
 * <p>
 * A word is uncommon if it appears exactly once in one of the sentences,
 * and does not appear in the other sentence.
 * <p>
 * Return a list of all uncommon words.
 * <p>
 * You may return the list in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: A = "this apple is sweet", B = "this apple is sour"
 * Output: ["sweet","sour"]
 * Example 2:
 * <p>
 * Input: A = "apple apple", B = "banana"
 * Output: ["banana"]
 * <p>
 * <p>
 * Note:
 * <p>
 * 0 <= A.length <= 200
 * 0 <= B.length <= 200
 * A and B both contain only spaces and lowercase letters.
 */
public class UncommonWordsFromTwoSentences {
    public String[] uncommonFromSentences(String A, String B) {
        String[] as = A.split(" ");
        String[] bs = B.split(" ");
        String[] longer = as.length > bs.length ? as : bs;
        String[] shorter = longer == as ? bs : as;
        as = longer;
        bs = shorter;
        Map<String, Integer> hsa = new HashMap<>();
        for (String s : as) {
            if (!hsa.containsKey(s)) {
                hsa.put(s, 0);
            }

            hsa.put(s, hsa.get(s) + 1);
        }
        Map<String, Integer> hsb = new HashMap<>();
        for (String s : bs) {
            if (!hsb.containsKey(s)) {
                hsb.put(s, 0);
            }

            hsb.put(s, hsb.get(s) + 1);
        }

        for (String s : as) {
            if (hsa.containsKey(s) && hsb.containsKey(s)) {
                hsa.remove(s);
                hsb.remove(s);
                continue;
            }

            if (hsa.containsKey(s) && hsa.get(s) > 1) {
                hsa.remove(s);
            }
        }

        String[] result = new String[hsa.size() + hsb.size()];
        int i = 0;

        for (String s : hsa.keySet()) {
            result[i] = s;
            ++i;
        }

        for (String s : hsb.keySet()) {
            result[i] = s;
            ++i;
        }

        return result;
    }
}
