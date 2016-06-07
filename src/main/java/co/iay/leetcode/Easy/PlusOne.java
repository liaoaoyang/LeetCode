package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/6/7.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int[] r = new int[digits.length];
        int now = 1;

        for (int i = digits.length - 1; i >= 0; --i) {
            r[i] = (now + digits[i]) % 10;
            now = (now + digits[i]) / 10;
        }

        if (now > 0) {
            int[] result = new int[digits.length + 1];

            for (int i = digits.length; i >= 1; --i) {
                result[i] = r[i - 1];
            }

            result[0] = now;

            return result;
        }

        return r;
    }
}
