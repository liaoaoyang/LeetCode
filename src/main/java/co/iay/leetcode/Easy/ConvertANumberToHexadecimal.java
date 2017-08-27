package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/10/1.
 */
public class ConvertANumberToHexadecimal {
    public String toHex(int num) {
        long n = num >= 0 ? num : num + 0x100000000L;
        String hex = "";

        while (n > 0) {
            long mod = n % 16;

            if (mod < 10) {
                hex = mod + hex;
            } else {
                hex = (char) ((mod - 10) + 'a') + hex;
            }

            n /= 16;
        }

        return hex.isEmpty() ? "0" : hex;
    }
}
