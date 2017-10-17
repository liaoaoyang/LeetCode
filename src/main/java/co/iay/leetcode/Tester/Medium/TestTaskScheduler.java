package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.TaskScheduler;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 2017/7/7.
 */
public class TestTaskScheduler {
    private TaskScheduler t = new TaskScheduler();

    @Test
    public void testTaskSchedulerCase1() {
        Assert.assertEquals(8,
                t.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2));
    }

    @Test
    public void testTaskSchedulerCase2() {
        Assert.assertEquals(12,
                t.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 4));
    }

    @Test
    public void testTaskSchedulerCase3() {
        Assert.assertEquals(8,
                t.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B', 'C', 'C'}, 1));
    }
}
