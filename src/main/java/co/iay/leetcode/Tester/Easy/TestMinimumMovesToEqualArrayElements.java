package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.MinimumMovesToEqualArrayElements;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/1/3.
 */
public class TestMinimumMovesToEqualArrayElements {
    private MinimumMovesToEqualArrayElements m = new MinimumMovesToEqualArrayElements();

    @Test
    public void testMinimumMovesToEqualArrayElementsCase1() {
        Assert.assertEquals(3, m.minMoves(new int[]{1, 2, 3}));
    }
}
