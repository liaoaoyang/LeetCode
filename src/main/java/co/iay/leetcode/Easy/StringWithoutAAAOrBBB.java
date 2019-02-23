package co.iay.leetcode.Easy;

/**
 * 984. String Without AAA or BBB
 * https://leetcode.com/problems/string-without-aaa-or-bbb/
 * Given two integers A and B, return any string S such that:
 * <p>
 * S has length A + B and contains exactly A 'a' letters, and exactly B 'b' letters;
 * The substring 'aaa' does not occur in S;
 * The substring 'bbb' does not occur in S.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: A = 1, B = 2
 * Output: "abb"
 * Explanation: "abb", "bab" and "bba" are all correct answers.
 * Example 2:
 * <p>
 * Input: A = 4, B = 1
 * Output: "aabaa"
 * <p>
 * <p>
 * Note:
 * <p>
 * 0 <= A <= 100
 * 0 <= B <= 100
 * It is guaranteed such an S exists for the given A and B.
 * Solutions:
 * 题目保证存在这类字符串的存在，假设a更多，首先按照ababa的方式进行第一次排布，
 * 之后填充a，每个a左边最多增加填充一个a即可（或者每个b左右）
 */
public class StringWithoutAAAOrBBB {
    public String strWithout3a3b(int A, int B) {
        StringBuilder sb = new StringBuilder();
        int bigger = A > B ? A : B;
        char biggerChar = A > B ? 'a' : 'b';
        int smaller = A > B ? B : A;
        char smallerChar = A > B ? 'b' : 'a';

        while (bigger > 0 && smaller > 0) {
            sb.append(biggerChar);
            --bigger;
            sb.append(smallerChar);
            --smaller;
        }

        if (bigger > 0) {
            sb.append(biggerChar);
            --bigger;
        }

        int i = 0;
        int nowBiggerCharCount = 0;

        while (bigger > 0) {
            char c = sb.charAt(i);
            if (c == biggerChar && nowBiggerCharCount < 2) {
                ++nowBiggerCharCount;
                sb.insert(i, biggerChar);
                --bigger;
                ++i;
            } else {
                nowBiggerCharCount = 0;
            }

            ++i;
        }

        return sb.toString();
    }
}
