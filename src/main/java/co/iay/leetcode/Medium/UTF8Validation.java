package co.iay.leetcode.Medium;

/**
 * Created by ng on 16/9/5.
 */
public class UTF8Validation {
    public boolean validUtf8(int[] data) {
        int type = 1;
        int cnt = 0;

        for (int d : data) {
            String bin = "00000000" + Integer.toBinaryString(d);
            bin = bin.substring(bin.length() - 8);

            if (type == 1) {
                if (bin.startsWith("0")) {
                    type = 1;
                } else if (bin.startsWith("110")) {
                    type = 2;
                } else if (bin.startsWith("1110")) {
                    cnt = 2;
                    type = 3;
                } else if (bin.startsWith("11110")) {
                    cnt = 3;
                    type = 4;
                } else {
                    return false;
                }

                continue;
            }

            if (type == 2) {
                if (bin.startsWith("10")) {
                    cnt = 0;
                    type = 1;
                } else {
                    return false;
                }

                continue;
            }

            if (bin.startsWith("10")) {
                --cnt;
            } else {
                return false;
            }

            if (cnt == 0) {
                type = 1;
            }
        }

        if (cnt != 0) {
            return false;
        }

        return true;
    }
}
