package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.MyCalendarI;
import org.junit.Assert;
import org.junit.Test;

public class TestMyCalendarI {
    @Test
    public void testMyCalendarI() {
        MyCalendarI.MyCalendar m = new MyCalendarI.MyCalendar();
        Assert.assertEquals(true, m.book(10, 20));
        Assert.assertEquals(false, m.book(15, 25));
        Assert.assertEquals(true, m.book(20, 30));
    }
}
