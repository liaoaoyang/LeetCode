package co.iay.leetcode.Easy;

/**
 * 709. To Lower Case
 * https://leetcode.com/problems/to-lower-case/
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: "Hello"
 * Output: "hello"
 * Example 2:
 * <p>
 * Input: "here"
 * Output: "here"
 * Example 3:
 * <p>
 * Input: "LOVELY"
 * Output: "lovely"
 */
public class ToLowerCase {
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder(str);
        int delta = 'a' - 'A';

        for (int i = 0; i < sb.length(); ++i) {
            char charAtI = sb.charAt(i);

            if (charAtI >= 'A' && charAtI <= 'Z') {
                sb.setCharAt(i, (char) (charAtI + delta));
            }
        }

        return sb.toString();
    }
}
