package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/8/7.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            if (!(Character.isLetter(c) || Character.isDigit(c))) {
                continue;
            }

            sb.append(c);
        }

        s = sb.toString();
        int sLen = s.length();

        for (int i = 0; i < sLen / 2; ++i) {
            if (s.charAt(i) != s.charAt(sLen - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
