package co.iay.leetcode.Easy;

/**
 * 1012. Complement of Base 10 Integer
 * https://leetcode.com/problems/complement-of-base-10-integer/
 * Every non-negative integer N has a binary representation.
 * For example, 5 can be represented as "101" in binary, 11 as "1011" in binary, and so on.
 * Note that except for N = 0, there are no leading zeroes in any binary representation.
 * <p>
 * The complement of a binary representation is the number in binary you get when changing every 1 to a 0 and 0 to a 1.
 * For example, the complement of "101" in binary is "010" in binary.
 * <p>
 * For a given number N in base-10, return the complement of it's binary representation as a base-10 integer.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: 5
 * Output: 2
 * Explanation: 5 is "101" in binary, with complement "010" in binary, which is 2 in base-10.
 * Example 2:
 * <p>
 * Input: 7
 * Output: 0
 * Explanation: 7 is "111" in binary, with complement "000" in binary, which is 0 in base-10.
 * Example 3:
 * <p>
 * Input: 10
 * Output: 5
 * Explanation: 10 is "1010" in binary, with complement "0101" in binary, which is 5 in base-10.
 * <p>
 * <p>
 * Note:
 * <p>
 * 0 <= N < 10^9
 * Solution:
 * 直接按位取反，Java没有unsigned类型，会导致符号位变化。
 * 考虑取出每一位取反，再放置到新数字的对应位置。
 * 以5(101)为例：
 * 1) 101 ^ 001 = 110 & 001 = 000 = 0 将0安放在最后一位
 * 2) 101 >> 1 = 010 ^ 001 = 011 & 001 = 001 = 1 将0安放在第二位
 * 3) 101 >> 1 >> 1 = 001 ^ 001 = 000 & 001 = 000 = 1 将0安放在第三位
 * 得出：
 * 010即2
 */
public class ComplementOfBase10Integer {
    public int bitwiseComplement(int N) {
        if (N == 0) {
            return 1;
        }

        int n = 0;
        int move = 0;

        while (N > 0) {
            n |= (((N ^ 1) & 1) << move);
            N = (N >> 1);
            ++move;
        }

        return n;

    }
}
