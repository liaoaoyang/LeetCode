package co.iay.leetcode.Medium;

/**
 * 338. Counting Bits
 * https://leetcode.com/problems/counting-bits/
 */
public class CountingBits {
    public int[] countBits(int num) {
        int[] result = new int[num + 1];

        for (int i = 0; i <= num; ++i) {
            int n = i;
            int count = 0;
            int mask = 1;

            while (n > 0) {
                if ((n & mask) > 0) {
                    ++count;
                    n ^= mask;
                }

                mask = (mask << 1);
            }

            result[i] = count;
        }

        return result;
    }
}
