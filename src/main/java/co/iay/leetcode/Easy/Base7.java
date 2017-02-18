package co.iay.leetcode.Easy;

/**
 * Created by ng on 17/2/18.
 */
public class Base7 {
    public String convertToBase7(int num) {
        if (0 == num)
        {
            return "0";
        }

        int numAbs = (num < 0 ? -1 * num : num);
        StringBuilder sb = new StringBuilder();

        while (numAbs != 0) {
            int digit = numAbs % 7;
            numAbs /= 7;
            sb.insert(0, digit);
        }

        return (num < 0 ? "-" : "") + sb.toString();
    }
}
