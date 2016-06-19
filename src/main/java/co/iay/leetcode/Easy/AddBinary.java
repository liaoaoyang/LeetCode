package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/6/9.
 * https://leetcode.com/problems/add-binary/
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        int now = 0;
        String result = "";
        int ai = a.length() - 1;
        int bi = b.length() - 1;

        for (; ai >= 0 || bi >= 0; --ai, --bi) {
            int val = 0;

            if (ai >= 0 && bi >= 0) {
                char ac = a.charAt(ai);
                char bc = b.charAt(bi);

                val = now + (ac - '0') + (bc - '0');
            } else if (ai >= 0) {
                char ac = a.charAt(ai);
                val = now + (ac - '0');
            } else {
                char bc = b.charAt(bi);
                val = now + (bc - '0');
            }

            result = val % 2 + result;
            now = val / 2;
        }

        if (now > 0) {
            result = 1 + result;
        }

        return result;
    }
}
