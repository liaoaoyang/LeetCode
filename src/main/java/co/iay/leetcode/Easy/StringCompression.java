package co.iay.leetcode.Easy;

/**
 * 443. String Compression
 * https://leetcode.com/problems/string-compression/
 * Given an array of characters, compress it in-place.
 * <p>
 * The length after compression must always be smaller than or equal to the original array.
 * <p>
 * Every element of the array should be a character (not int) of length 1.
 * <p>
 * After you are done modifying the input array in-place, return the new length of the array.
 * <p>
 * Follow up:
 * Could you solve it using only O(1) extra space?
 * <p>
 * Example 1:
 * <p>
 * Input:
 * ["a","a","b","b","c","c","c"]
 * <p>
 * Output:
 * Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
 * <p>
 * Explanation:
 * "aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is replaced by "c3".
 * <p>
 * Example 2:
 * <p>
 * Input:
 * ["a"]
 * <p>
 * Output:
 * Return 1, and the first 1 characters of the input array should be: ["a"]
 * <p>
 * Explanation:
 * Nothing is replaced.
 * <p>
 * Example 3:
 * <p>
 * Input:
 * ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
 * <p>
 * Output:
 * Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
 * <p>
 * Explanation:
 * Since the character "a" does not repeat, it is not compressed. "bbbbbbbbbbbb" is replaced by "b12".
 * Notice each digit has it's own entry in the array.
 * <p>
 * Note:
 * <p>
 * All characters have an ASCII value in [35, 126].
 * 1 <= len(chars) <= 1000.
 */
public class StringCompression {
    private int toIntChars(int curCnt, char[] chars, int result) {
        int curCntLen = 0;
        int tempCurCnt = curCnt;

        while (tempCurCnt > 0) {
            ++curCntLen;
            tempCurCnt /= 10;
        }

        int i = result + curCntLen - 1;

        while (curCnt > 0) {
            chars[i] = (char) ((curCnt % 10) + '0');
            curCnt /= 10;
            --i;
            ++result;
        }

        return result;
    }

    public int compress(char[] chars) {
        char cur = 0;
        int curCnt = 0;
        int result = 0;

        for (char c : chars) {
            if (cur != c) {
                if (cur > 0 && curCnt > 1) {
                    result = toIntChars(curCnt, chars, result);
                }

                curCnt = 1;
                cur = c;
                chars[result] = c;
                ++result;
                continue;
            }

            ++curCnt;
        }

        if (curCnt > 1) {
            result = toIntChars(curCnt, chars, result);
        }

        return result;
    }
}
