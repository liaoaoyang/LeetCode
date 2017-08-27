package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/7/5.
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        if (n <= 0) {
            return "";
        }

        String result = "";

        while (n > 0) {
            result = (char) ('A' + (n % 26 == 0 ? 26 : n % 26) - 1) + result;
            n /= 26;

            if (result.charAt(0) == 'Z') {
                n -= 1;
            }
        }

        return result;
    }
}
