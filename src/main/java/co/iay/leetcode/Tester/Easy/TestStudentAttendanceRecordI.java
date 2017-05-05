package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.StudentAttendanceRecordI;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/4/21.
 */
public class TestStudentAttendanceRecordI {
    private StudentAttendanceRecordI s = new StudentAttendanceRecordI();

    @Test
    public void testStudentAttendanceRecordICase1() {
        Assert.assertEquals(true, s.checkRecord("PPALLP"));
    }

    @Test
    public void testStudentAttendanceRecordICase2() {
        Assert.assertEquals(false, s.checkRecord("PPALLL"));
    }
}
