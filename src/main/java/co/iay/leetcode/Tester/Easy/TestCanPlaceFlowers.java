package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.CanPlaceFlowers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 2017/6/7.
 */
public class TestCanPlaceFlowers {
    private CanPlaceFlowers c = new CanPlaceFlowers();

    @Test
    public void testCanPlaceFlowerCase1() {
        Assert.assertEquals(true, c.canPlaceFlowers(
                new int[]{1, 0, 0, 0, 1},
                1)
        );
    }

    @Test
    public void testCanPlaceFlowerCase2() {
        Assert.assertEquals(false, c.canPlaceFlowers(
                new int[]{1, 0, 0, 0, 1},
                2)
        );
    }

    @Test
    public void testCanPlaceFlowerCase3() {
        Assert.assertEquals(false, c.canPlaceFlowers(
                new int[]{1, 0, 0, 0, 0, 1},
                2)
        );
    }

    @Test
    public void testCanPlaceFlowerCase4() {
        Assert.assertEquals(true, c.canPlaceFlowers(
                new int[]{0, 0, 1, 0, 1},
                1)
        );
    }

    @Test
    public void testCanPlaceFlowerCase5() {
        Assert.assertEquals(true, c.canPlaceFlowers(
                new int[]{1, 0, 1, 0, 0},
                1)
        );
    }

    @Test
    public void testCanPlaceFlowerCase6() {
        Assert.assertEquals(true, c.canPlaceFlowers(
                new int[]{1, 0, 1, 0, 0, 0},
                1)
        );
    }

    @Test
    public void testCanPlaceFlowerCase7() {
        Assert.assertEquals(true, c.canPlaceFlowers(
                new int[]{0, 0},
                1)
        );
    }

    @Test
    public void testCanPlaceFlowerCase8() {
        Assert.assertEquals(true, c.canPlaceFlowers(
                new int[]{0},
                1)
        );
    }

    @Test
    public void testCanPlaceFlowerCase9() {
        Assert.assertEquals(false, c.canPlaceFlowers(
                new int[]{0, 1, 0},
                1)
        );
    }
}
