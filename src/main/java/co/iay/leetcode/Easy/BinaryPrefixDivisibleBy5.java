package co.iay.leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 1018. Binary Prefix Divisible By 5
 * https://leetcode.com/problems/binary-prefix-divisible-by-5/
 * Given an array A of 0s and 1s, consider N_i: the i-th subarray from A[0] to A[i] interpreted as a binary number (from most-significant-bit to least-significant-bit.)
 * <p>
 * Return a list of booleans answer, where answer[i] is true if and only if N_i is divisible by 5.
 * <p>
 * Example 1:
 * <p>
 * Input: [0,1,1]
 * Output: [true,false,false]
 * Explanation:
 * The input numbers in binary are 0, 01, 011; which are 0, 1, and 3 in base-10.  Only the first number is divisible by 5, so answer[0] is true.
 * Example 2:
 * <p>
 * Input: [1,1,1]
 * Output: [false,false,false]
 * Example 3:
 * <p>
 * Input: [0,1,1,1,1,1]
 * Output: [true,false,false,false,true,false]
 * Example 4:
 * <p>
 * Input: [1,1,1,0,1]
 * Output: [false,false,false,false,false]
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 30000
 * A[i] is 0 or 1
 * Solution:
 * 判断二进制数生成的十进制数最后一位是否能被5整除。
 * 由于A.length可能很大，直接生成十进制数不现实。
 * 当对应的十进制数超过10之后最后一位变为0，都能被10整除，进而都满足条件。
 * 于是在最后一位数字上做文章。
 * 每当处理下一个数字，最后一位数字需要X2（左移一位），同时加上当前二进制位的值。
 * 和10取余之后，得到当前数字的最后一位，判断%5结果即可。
 */
public class BinaryPrefixDivisibleBy5 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        int n = 0;
        List<Boolean> result = new ArrayList<>(A.length);

        for (int a : A) {
            n = ((n * 2) % 10) + a;
            result.add(n % 5 == 0);
        }

        return result;
    }
}
