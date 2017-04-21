package co.iay.leetcode.Easy;

/**
 * Created by ng on 17/4/21.
 * 551. Student Attendance Record I
 * https://leetcode.com/problems/student-attendance-record-i/
 */
public class StudentAttendanceRecordI {
    final private static int A = 0;
    final private static int L = 1;
    final private static int P = 2;

    public boolean checkRecord(String s) {
        int prevL = Integer.MIN_VALUE;
        int prevPrevL = Integer.MIN_VALUE;
        char[] cs = s.toCharArray();
        int[] c = new int[3];

        for (int i = 0; i < cs.length; ++i) {
            if (cs[i] == 'A') {
                ++c[A];

                if (c[A] > 1) {
                    return false;
                }

                continue;
            }

            if (cs[i] == 'L') {
                if (prevPrevL + 1 == prevL && prevL == i - 1) {
                    return false;
                }

                prevPrevL = prevL;
                prevL = i;
                ++c[L];
                continue;
            }

            ++c[P];
        }

        return true;
    }
}
