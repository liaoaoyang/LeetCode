package co.iay.leetcode.Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 784. Letter Case Permutation
 * https://leetcode.com/problems/letter-case-permutation/
 * Given a string S, we can transform every letter individually to be lowercase or
 * uppercase to create another string.  Return a list of all possible strings we could create.
 * <p>
 * Examples:
 * Input: S = "a1b2"
 * Output: ["a1b2", "a1B2", "A1b2", "A1B2"]
 * <p>
 * Input: S = "3z4"
 * Output: ["3z4", "3Z4"]
 * <p>
 * Input: S = "12345"
 * Output: ["12345"]
 * Note:
 * <p>
 * S will be a string with length at most 12.
 * S will consist only of letters or digits.
 * Solution:
 * 常规的排列组合问题，字符串长度不大，直接递归处理即可。
 */

public class LetterCasePermutation {
    private void p(HashSet<String> result, String s, int index, String now) {
        if (index == s.length()) {
            result.add(now);
            return;
        }

        char c = s.charAt(index);

        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            p(result, s, index + 1, now + (c + "").toUpperCase());
            p(result, s, index + 1, now + (c + "").toLowerCase());
        } else {
            p(result, s, index + 1, now + c);
        }
    }

    public List<String> letterCasePermutation(String S) {
        HashSet<String> resultSet = new HashSet<String>();
        p(resultSet, S, 0, "");

        return new ArrayList<String>(resultSet);
    }
}
