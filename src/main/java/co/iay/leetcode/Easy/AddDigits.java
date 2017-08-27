package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/5/29.
 * https://leetcode.com/problems/add-digits/
 */
public class AddDigits {
    public int addDigits(int num) {
        int now = num;
        int result = 0;

        while (now >= 10) {
            while (now > 0) {
                result += (now % 10);
                now /= 10;
            }

            now = result;
            result = 0;
        }

        return now;
    }
}
