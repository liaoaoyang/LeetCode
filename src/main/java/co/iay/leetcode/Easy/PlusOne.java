package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/6/7.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        String result = "";
        int now = 1;

        for (int i = digits.length - 1; i >= 0; --i) {
            result = (now + digits[i]) % 10 + result;
            now = (now + digits[i]) / 10;
        }

        if (now > 0) {
            result = now + result;
        }

        int[] r = new int[result.length()];

        for (int i = 0; i < result.length(); ++i) {
            r[i] = result.charAt(i) - '0';
        }

        return r;
    }
}
