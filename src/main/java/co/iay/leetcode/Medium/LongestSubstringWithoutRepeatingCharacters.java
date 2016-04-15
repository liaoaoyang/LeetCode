package co.iay.leetcode.Medium;

/**
 * Created by ng on 16/4/10.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int startIdx = 0;

        for (int i = 0; i < s.length(); ++i) {
            String atI = s.substring(i, i + 1);
            String currentLongest = s.substring(startIdx, i);
            int repeatIdx = currentLongest.indexOf(atI);

            if (repeatIdx >= 0) {
                if (currentLongest.length() > longest) {
                    longest = currentLongest.length();
                }

                startIdx += (repeatIdx + 1);
            }
        }

        if (s.substring(startIdx).length() > longest) {
            longest = s.substring(startIdx).length();
        }

        return longest;
    }
}

