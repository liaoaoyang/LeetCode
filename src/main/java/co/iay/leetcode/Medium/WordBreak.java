package co.iay.leetcode.Medium;

import java.util.HashSet;
import java.util.List;

/**
 * 139. Word Break
 * https://leetcode.com/problems/word-break/
 *
 * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words,
 * determine if s can be segmented into a space-separated sequence of one or more dictionary words.
 * You may assume the dictionary does not contain duplicate words.
 *
 * For example, given
 * s = "leetcode",
 * dict = ["leet", "code"].
 *
 * Return true because "leetcode" can be segmented as "leet code".
 *
 * UPDATE (2017/1/4):
 * The wordDict parameter had been changed to a list of strings (instead of a set of strings).
 * Please reload the code definition to get the latest changes.
 *
 * Notes:
 *
 * dp(i) = dp(j) && dict.contains(s.substr(j + 1, i - j))
 */

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> dict = new HashSet<String>(wordDict.size());
        dict.addAll(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i < dp.length; ++i) {
            for (int j = i - 1; j >= 0 && !dp[i]; --j) {
                String sJI = s.substring(j, i);
                dp[i] = (dp[j] && dict.contains(sJI));
            }
        }

        return dp[dp.length - 1];
    }
}
