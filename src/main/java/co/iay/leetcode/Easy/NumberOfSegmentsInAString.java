package co.iay.leetcode.Easy;

/**
 * Created by ng on 17/3/13.
 * 434. Number of Segments in a String
 * https://leetcode.com/problems/number-of-segments-in-a-string
 */
public class NumberOfSegmentsInAString {
    public int countSegments(String s) {
        final int STATUS_INIT = 0;
        final int STATUS_SPACE = 1;
        final int STATUS_NON_SPACE = 2;

        int len = s.length();
        int seg = 0;
        int status = STATUS_INIT;

        for (int i = 0; i < len; ++i) {
            char c = s.charAt(i);

            if (c == ' ') {
                status = STATUS_SPACE;
                continue;
            }

            if (status == STATUS_INIT || status == STATUS_SPACE) {
                ++seg;
                status = STATUS_NON_SPACE;
            }
        }

        return seg;
    }
}
