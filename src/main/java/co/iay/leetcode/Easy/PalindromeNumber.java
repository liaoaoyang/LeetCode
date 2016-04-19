package co.iay.leetcode.Easy;

/**
 * Created by aoyang on 16/4/18.
 */
public class PalindromeNumber {
    public static int len(int v) {
        return (v == 0 ? 0 : 1 + len(v / 10));
    }

    public static int reverse(int x) {
        if (x < 10) {
            return x;
        }

        return reverse(x / 10) + (x % 10) * (int)Math.pow(10, len(x) - 1);
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (x == 0) {
            return true;
        }

        return x == reverse(x);
    }
}
