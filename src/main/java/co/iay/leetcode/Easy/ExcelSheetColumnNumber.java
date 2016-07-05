package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/7/5.
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int r = 0;

        for(int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            r = 26 * r + (c - 'A' + 1);
        }

        return r;
    }
}