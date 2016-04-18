package co.iay.leetcode.Easy;

/**
 * Created by aoyang on 16/4/18.
 */
public class PalindromeNumber {
    public static int len(int v) {
        return (v == 0 ? 0 : 1 + len(v / 10));
    }

    public static int top(int v) {
        return (int)(v / Math.pow(10, len(v) - 1));
    }

    public static int low(int v) {
        return v % 10;
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (x == 0) {
            return true;
        }


        while (x > 0) {
            if (len(x) == 1) {
                return true;
            }

            if (top(x) != low(x)) {
                return false;
            }

            x %= Math.pow(10, len(x) - 1);
            x /= 10;
        }

        return true;
    }
}
