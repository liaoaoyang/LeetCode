package co.iay.leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ng on 2017/7/2.
 * 17. Letter Combinations of a Phone Number
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 */
public class LetterCombinationsOfAPhoneNumber {
    private static char[][] digitsCharsMap = new char[][]{
            new char[]{},
            new char[]{},
            new char[]{'a', 'b', 'c'},
            new char[]{'d', 'e', 'f'},
            new char[]{'g', 'h', 'i'},
            new char[]{'j', 'k', 'l'},
            new char[]{'m', 'n', 'o'},
            new char[]{'p', 'q', 'r', 's'},
            new char[]{'t', 'u', 'v'},
            new char[]{'w', 'x', 'y', 'z'},
    };

    private void build(String s, List<String> result, char[] c, int index) {
        if (index == c.length) {
            if (!s.isEmpty()) {
                result.add(s);
            }
            return;
        }

        int i = c[index] - '0';

        if (i <= 1) {
            build(s, result, c, index + 1);
            return;
        }

        for (int j = 0; j < digitsCharsMap[i].length; ++j) {
            build(s + digitsCharsMap[i][j], result, c, index + 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        char[] digitsChars = digits.replace("1", "").replace("0", "").toCharArray();
        List<String> result = new ArrayList<String>();
        build("", result, digitsChars, 0);
        return result;
    }
}
