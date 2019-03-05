package co.iay.leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 1002. Find Common Characters
 * https://leetcode.com/problems/find-common-characters/
 * Given an array A of strings made only from lowercase letters,
 * return a list of all characters that show up in all strings within the list (including duplicates).
 * For example, if a character occurs 3 times in all strings but not 4 times,
 * you need to include that character three times in the final answer.
 * <p>
 * You may return the answer in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: ["bella","label","roller"]
 * Output: ["e","l","l"]
 * Example 2:
 * <p>
 * Input: ["cool","lock","cook"]
 * Output: ["c","o"]
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 100
 * 1 <= A[i].length <= 100
 * A[i][j] is a lowercase letter
 * Solution:
 * 首先统计每个字符串中各个字符的出现次数。
 * 用二位数组组织数据，横轴是各个a-z字母在一个字符串中出现的次数，纵轴是各个字符串。
 * 由于全是26个字母，只需要对所有字符串的统计结果进行纵向遍历，找到最小出现的次数，
 * 即为当前字母共同出现的次数，即结果。
 */
public class FindCommonCharacters {
    public List<String> commonChars(String[] A) {
        if (A.length == 0) {
            return new ArrayList<>();
        }

        int[][] ac = new int[A.length][26];

        for (int i = 0; i < A.length; ++i) {
            String aA = A[i];

            for (char a : aA.toCharArray()) {
                ac[i][a - 'a']++;
            }
        }

        List<String> result = new ArrayList<>();

        for (int i = 0; i < 26; ++i) {
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < A.length; ++j) {
                min = min > ac[j][i] ? ac[j][i] : min;
            }

            while (min > 0) {
                result.add(((char) (i + 'a')) + "");
                --min;
            }
        }

        return result;
    }
}
