package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/10/10.
 */
public class AddStrings {
    public String addStrings(String num1, String num2) {
        String longer = num1.length() > num2.length() ? num1 : num2;
        String shorter = num1.length() > num2.length() ? num2 : num1;
        String result = "";
        int over = 0;

        for (int i = 0; i < longer.length(); ++i) {
            int longerIdx = longer.length() - i - 1;
            int shorterIdx = shorter.length() - i - 1;

            if (shorterIdx >= 0) {
                over = longer.charAt(longerIdx) - '0' + shorter.charAt(shorterIdx) - '0' + over;
            } else {
                over = longer.charAt(longerIdx) - '0' + over;
            }

            result =  (over % 10) + result;
            over /= 10;
        }

        if (over > 0) {
            result = over + result;
        }

        return result;
    }
}
