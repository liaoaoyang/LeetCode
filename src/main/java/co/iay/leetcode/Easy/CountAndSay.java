package co.iay.leetcode.Easy;

/**
 * Created by ng on 17/3/9.
 * 38. Count and Say
 * https://leetcode.com/problems/count-and-say
 */
public class CountAndSay {
    public String countAndSay(int n) {
        if (n == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("1");

        for (int l = 1; l < n; ++l) {
            char[] prev = sb.toString().toCharArray();
            sb = new StringBuilder();

            for (int i = 0; i < prev.length; ++i) {
                int charSameCount = 1;

                while ((i + 1) < prev.length && prev[i] == prev[i + 1]) {
                    ++charSameCount;
                    ++i;
                }

                sb.append(charSameCount + "" + prev[i]);
            }
        }

        return sb.toString();
    }
}
