package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/5/8.
 * https://leetcode.com/problems/reverse-string/
 */
public class ReverseString {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
