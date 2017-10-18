package co.iay.leetcode.Easy;

/**
 * 686. Repeated String Match
 * https://leetcode.com/problems/repeated-string-match/
 * <p>
 * Given two strings A and B, find the minimum number of times A
 * has to be repeated such that B is a substring of it.
 * If no such solution, return -1.
 * <p>
 * For example, with A = "abcd" and B = "cdabcdab".
 * <p>
 * Return 3, because by repeating A three times (“abcdabcdabcd”),
 * B is a substring of it; and B is not a substring of A repeated two times ("abcdabcd").
 * <p>
 * Note:
 * The length of A and B will be between 1 and 10000.
 * <p>
 * Solution:
 * 首先判断二者长度，如果B比A串长，那么先算出二者的长度倍数差距N，先将A串复制N次，
 * 之后查找字符串，如果还不是字串，那么再在前后各自附上A串，如果N+2倍长度都无法找
 * 到，那么说明无论如何构造都不能实现题目中的要求了。
 */

public class RepeatedStringMatch {
    public int repeatedStringMatch(String A, String B) {
        int times = (int) Math.ceil(B.length() / A.length());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 2 + times; ++i) {
            sb.append(A);

            if (i < times) {
                continue;
            }

            if (sb.toString().contains(B)) {
                return i;
            }
        }

        return -1;
    }
}
