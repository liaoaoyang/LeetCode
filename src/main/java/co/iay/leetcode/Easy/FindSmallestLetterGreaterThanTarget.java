package co.iay.leetcode.Easy;

/**
 * 744. Find Smallest Letter Greater Than Target
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 * Given a list of sorted characters letters containing only lowercase letters, and given a target letter target, find the smallest element in the list that is larger than the given target.
 * <p>
 * Letters also wrap around. For example, if the target is target = 'z' and letters = ['a', 'b'], the answer is 'a'.
 * <p>
 * Examples:
 * Input:
 * letters = ["c", "f", "j"]
 * target = "a"
 * Output: "c"
 * <p>
 * Input:
 * letters = ["c", "f", "j"]
 * target = "c"
 * Output: "f"
 * <p>
 * Input:
 * letters = ["c", "f", "j"]
 * target = "d"
 * Output: "f"
 * <p>
 * Input:
 * letters = ["c", "f", "j"]
 * target = "g"
 * Output: "j"
 * <p>
 * Input:
 * letters = ["c", "f", "j"]
 * target = "j"
 * Output: "c"
 * <p>
 * Input:
 * letters = ["c", "f", "j"]
 * target = "k"
 * Output: "c"
 * Note:
 * letters has a length in range [2, 10000].
 * letters consists of lowercase letters, and contains at least 2 unique letters.
 * target is a lowercase letter.
 * Solution:
 * 根据数据特点使用数组作为Hash，记录出现频次，降低遍历数据长度，之后遍历获取最大字符即可。
 */
public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int[] ct = new int[26];

        for (char letter : letters) {
            ct[letter - 'a']++;
        }

        int ctEnd = ct.length - 1;

        while (ctEnd > 0 && ct[ctEnd] == 0) {
            --ctEnd;
        }

        char result = '\0';

        for (int i = 0; i <= ctEnd; ++i) {
            if (ct[i] == 0) {
                continue;
            }

            if (result == '\0') {
                result = (char) (i + 'a');
            }

            if ((char) (i + 'a') > target) {
                result = (char) (i + 'a');
                break;
            }
        }

        return result;
    }
}
