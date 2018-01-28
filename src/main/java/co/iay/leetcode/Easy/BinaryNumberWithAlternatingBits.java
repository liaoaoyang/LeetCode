package co.iay.leetcode.Easy;

/**
 * 693. Binary Number with Alternating Bits
 * https://leetcode.com/problems/binary-number-with-alternating-bits/
 * Given a positive integer, check whether it has alternating bits:
 * namely, if two adjacent bits will always have different values.
 * <p>
 * Example 1:
 * Input: 5
 * Output: True
 * Explanation:
 * The binary representation of 5 is: 101
 * Example 2:
 * Input: 7
 * Output: False
 * Explanation:
 * The binary representation of 7 is: 111.
 * Example 3:
 * Input: 11
 * Output: False
 * Explanation:
 * The binary representation of 11 is: 1011.
 * Example 4:
 * Input: 10
 * Output: True
 * Explanation:
 * The binary representation of 10 is: 1010.
 * Solution:
 * 序列应该形如0101或者1010，所以可以把问题转化为形如
 * n = 2^0+2^(2)+2^(4)+...+2^(i) 或
 * n = 2^0+2^(1)+2^(3)+...+2^(i)
 * 只需要判断是否能形成其中之一的组成形式即可
 */
public class BinaryNumberWithAlternatingBits {
    private boolean hasAlternatingBits(int n, int p) {
        long sum = 0;
        long N = n;

        while (sum < N) {
            sum += (long) Math.pow(2, p);

            if (sum == N) {
                return true;
            }

            p += 2;
        }

        return false;
    }

    public boolean hasAlternatingBits(int n) {
        return hasAlternatingBits(n, 0) || hasAlternatingBits(n, 1);
    }
}
