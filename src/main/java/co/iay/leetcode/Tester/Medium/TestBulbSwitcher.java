package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.BulbSwitcher;
import org.junit.Assert;
import org.junit.Test;

public class TestBulbSwitcher {
    private BulbSwitcher b = new BulbSwitcher();

    @Test
    public void testBulbSwitcherCase1() {
        Assert.assertEquals(2, b.bulbSwitch(5));
    }
}
