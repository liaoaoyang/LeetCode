package co.iay.leetcode.Easy;

/**
 * 788. Rotated Digits
 * https://leetcode.com/problems/rotated-digits/
 * X is a good number if after rotating each digit individually by 180 degrees,
 * we get a valid number that is different from X.  Each digit must be rotated -
 * we cannot choose to leave it alone.
 * <p>
 * A number is valid if each digit remains a digit after rotation.
 * 0, 1, and 8 rotate to themselves; 2 and 5 rotate to each other; 6 and 9 rotate to each other,
 * and the rest of the numbers do not rotate to any other number and become invalid.
 * <p>
 * Now given a positive number N, how many numbers X from 1 to N are good?
 * <p>
 * Example:
 * Input: 10
 * Output: 4
 * Explanation:
 * There are four good numbers in the range [1, 10] : 2, 5, 6, 9.
 * Note that 1 and 10 are not good numbers, since they remain unchanged after rotating.
 * Note:
 * <p>
 * N  will be in range [1, 10000].
 * Solution:
 * 题目所说的rotate实际上是反转的意思，即单个数字反转180度，那么3 4 7这3个数字反转之后是不能成为其他数字的。
 * 所以尝试把每一位的数字变为反转后的数字即可。再判断是否与原数字相同。
 */
public class RotatedDigits {
    public int rotatedDigits(int N) {
        int n = 0;

        for (int i = 1; i <= N; ++i) {
            String num = i + "";

            if (num.contains("3") ||
                    num.contains("4") ||
                    num.contains("7")) {
                continue;
            }

            int rotated = 0;

            for (int j = 0; j < num.length(); ++j) {
                rotated = rotated * 10;

                int numAtJ = num.charAt(j) - '0';

                if (numAtJ == 2) {
                    rotated += 5;
                } else if (numAtJ == 5) {
                    rotated += 2;
                } else if (numAtJ == 6) {
                    rotated += 9;
                } else if (numAtJ == 9) {
                    rotated += 6;
                } else {
                    rotated += numAtJ;
                }
            }

            if (rotated != i) {
                ++n;
            }
        }

        return n;
    }
}
