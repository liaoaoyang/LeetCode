package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/4/16.
 * https://leetcode.com/problems/reverse-integer/
 */
public class ReverseInteger {
    public int reverse(int x) {
        StringBuffer sb = new StringBuffer(x + "");
        Long xL;
        int factor = 1;

        if (sb.substring(0, 1).equals("-")) {
            factor = -1;
            xL = Long.parseLong(sb.replace(0, 1, "").reverse().toString());
        } else {
            xL = Long.parseLong(sb.reverse().toString());
        }

        if (factor > 0 && xL > Integer.MAX_VALUE) {
            return 0;
        }

        if (factor < 0 && (-1 * xL) < Integer.MIN_VALUE) {
            return 0;
        }

        return xL.intValue() * factor;
    }
}
