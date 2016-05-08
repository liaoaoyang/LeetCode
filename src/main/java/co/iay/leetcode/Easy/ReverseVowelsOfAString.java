package co.iay.leetcode.Easy;

import java.util.HashMap;

/**
 * Created by ng on 16/5/8.
 */
public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        HashMap<String, Boolean> vowels = new HashMap<String, Boolean>();
        vowels.put("a", true);
        vowels.put("e", true);
        vowels.put("i", true);
        vowels.put("o", true);
        vowels.put("u", true);
        vowels.put("A", true);
        vowels.put("E", true);
        vowels.put("I", true);
        vowels.put("O", true);
        vowels.put("U", true);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            if (vowels.containsKey(c + "")) {
                sb.append(c);
            }
        }

        String reversedVowels = sb.reverse().toString();

        int reversedIdx = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            if (vowels.containsKey(c + "")) {
                result.append(reversedVowels.charAt(reversedIdx));
                ++reversedIdx;
                continue;
            }

            result.append(c);
        }

        return result.toString();
    }
}
