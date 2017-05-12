package co.iay.leetcode.Medium;

/**
 * Created by ng on 2017/5/12.
 * 482. License Key Formatting
 * https://leetcode.com/problems/license-key-formatting/
 */
public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String S, int K) {
        StringBuffer sb = new StringBuffer();
        char[] sc = S.toCharArray();
        int handled = 0;

        for (int i = sc.length - 1; i >= 0; --i) {
            if (sc[i] == '-') {
                continue;
            }

            sb.insert(0, Character.toUpperCase(sc[i]));
            ++handled;

            if (handled % K == 0) {
                sb.insert(0, '-');
            }
        }

        while (sb.length() > 0 && sb.substring(0, 1).equals("-")) {
            sb.delete(0, 1);
        }

        return sb.toString();
    }
}
