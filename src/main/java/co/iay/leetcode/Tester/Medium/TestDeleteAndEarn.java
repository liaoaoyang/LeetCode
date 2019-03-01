package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.DeleteAndEarn;
import org.junit.Assert;
import org.junit.Test;

public class TestDeleteAndEarn {
    private DeleteAndEarn d = new DeleteAndEarn();

    @Test
    public void testDeleteAndEarnCase1() {
        Assert.assertEquals(6, d.deleteAndEarn(
                new int[]{3, 2, 4}
        ));
    }

    @Test
    public void testDeleteAndEarnCase2() {
        Assert.assertEquals(9, d.deleteAndEarn(
                new int[]{2, 2, 3, 3, 3, 4}
        ));
    }

    @Test
    public void testDeleteAndEarnCase3() {
        Assert.assertEquals(52, d.deleteAndEarn(
                new int[]{8, 7, 3, 8, 1, 4, 10, 10, 10, 2}
        ));
    }

    @Test
    public void testDeleteAndEarnCase4() {
        Assert.assertEquals(6, d.deleteAndEarn(
                new int[]{1, 3, 2, 4}
        ));
    }

    @Test
    public void testDeleteAndEarnCase5() {
        Assert.assertEquals(61, d.deleteAndEarn(
                new int[]{8, 3, 4, 7, 6, 6, 9, 2, 5, 8, 2, 4, 9, 5, 9, 1, 5, 7, 1, 4}
        ));
    }

    @Test
    public void testDeleteAndEarnCase6() {
        Assert.assertEquals(66, d.deleteAndEarn(
                new int[]{3, 7, 10, 5, 2, 4, 8, 9, 9, 4, 9, 2, 6, 4, 6, 5, 4, 7, 6, 10}
        ));
    }
}
