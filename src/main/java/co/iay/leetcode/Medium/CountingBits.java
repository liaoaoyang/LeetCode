package co.iay.leetcode.Medium;

/**
 * 338. Counting Bits
 * https://leetcode.com/problems/counting-bits/
 */
public class CountingBits {
    @SuppressWarnings("unused")
    private int[] oNSizeOfNumSolution(int num) {
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

    // form http://www.cnblogs.com/grandyang/p/5294255.html
    private int[] oNSolution(int num) {
        int[] result = new int[num + 1];

        for (int i = 1; i <= num; ++i) {
            result[i] = result[i & (i - 1)] + 1;
        }

        return result;
    }

    public int[] countBits(int num) {
        return oNSolution(num);
    }
}
