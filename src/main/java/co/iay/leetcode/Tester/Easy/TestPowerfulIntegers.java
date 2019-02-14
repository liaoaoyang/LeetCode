package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.PowerfulIntegers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestPowerfulIntegers {
    private PowerfulIntegers p = new PowerfulIntegers();

    @Test
    public void testPowerfulIntegersCase1() {
        List<Integer> output = p.powerfulIntegers(2, 3, 10);
        Collections.sort(output);
        Assert.assertEquals(output, Arrays.asList(2, 3, 4, 5, 7, 9, 10));
    }

    @Test
    public void testPowerfulIntegersCase2() {
        List<Integer> output = p.powerfulIntegers(3, 5, 15);
        Collections.sort(output);
        Assert.assertEquals(output, Arrays.asList(2, 4, 6, 8, 10, 14));
    }

    @Test
    public void testPowerfulIntegersCase3() {
        List<Integer> output = p.powerfulIntegers(1, 2, 10);
        Collections.sort(output);
        Assert.assertEquals(output, Arrays.asList(2, 3, 5, 9));
    }
}
