package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.RottingOranges;
import org.junit.Assert;
import org.junit.Test;

public class TestRottingOranges {
    private RottingOranges r = new RottingOranges();

    @Test
    public void testRottingOrangesCase1() {
        Assert.assertEquals(4,
                r.orangesRotting(new int[][]{
                        new int[]{2, 1, 1},
                        new int[]{1, 1, 0},
                        new int[]{0, 1, 1},
                }));
    }

    @Test
    public void testRottingOrangesCase2() {
        Assert.assertEquals(-1,
                r.orangesRotting(new int[][]{
                        new int[]{2, 1, 1},
                        new int[]{0, 1, 1},
                        new int[]{1, 0, 1},
                }));
    }

    @Test
    public void testRottingOrangesCase3() {
        Assert.assertEquals(0,
                r.orangesRotting(new int[][]{
                        new int[]{0, 2},
                }));
    }

    @Test
    public void testRottingOrangesCase4() {
        Assert.assertEquals(0,
                r.orangesRotting(new int[][]{
                        new int[]{0},
                }));
    }

    @Test
    public void testRottingOrangesCase5() {
        Assert.assertEquals(-1,
                r.orangesRotting(new int[][]{
                        new int[]{1},
                }));
    }

    @Test
    public void testRottingOrangesCase6() {
        Assert.assertEquals(0,
                r.orangesRotting(new int[][]{
                        new int[]{2},
                }));
    }

    @Test
    public void testRottingOrangesCase7() {
        Assert.assertEquals(1,
                r.orangesRotting(new int[][]{
                        new int[]{1, 2},
                }));
    }
}
