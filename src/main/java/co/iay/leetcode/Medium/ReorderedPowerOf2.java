package co.iay.leetcode.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 869. Reordered Power of 2
 * https://leetcode.com/problems/reordered-power-of-2/description/
 * Starting with a positive integer N,
 * we reorder the sDigits in any order (including the original order)
 * such that the leading digit is not zero.
 * <p>
 * Return true if and only if we can do this in a way
 * such that the resulting number is a power of 2.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: 1
 * Output: true
 * Example 2:
 * <p>
 * Input: 10
 * Output: false
 * Example 3:
 * <p>
 * Input: 16
 * Output: true
 * Example 4:
 * <p>
 * Input: 24
 * Output: false
 * Example 5:
 * <p>
 * Input: 46
 * Output: true
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= N <= 10^9
 */
public class ReorderedPowerOf2 {
    private static Map<String, Long> sDigits = null;

    private Map<String, Long> getDigits() {
        if (null == sDigits) {
            sDigits = new HashMap<>();
            Long v = 1L;

            while (v <= Integer.MAX_VALUE) {
                int[] ds = new int[10];
                Long vv = v;

                while (vv > 0) {
                    ds[(int) (vv % 10)]++;
                    vv /= 10;
                }

                sDigits.put(Arrays.toString(ds), v);

                v <<= 1;
            }
        }

        return sDigits;
    }

    public boolean reorderedPowerOf2(int N) {
        Map<String, Long> digits = getDigits();

        int[] ds = new int[10];
        Long vv = (long) N;

        while (vv > 0) {
            ds[(int) (vv % 10)]++;
            vv /= 10;
        }

        return digits.containsKey(Arrays.toString(ds));
    }
}
