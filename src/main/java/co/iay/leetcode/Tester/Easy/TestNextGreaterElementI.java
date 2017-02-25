package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.NextGreaterElementI;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/2/25.
 */
public class TestNextGreaterElementI {
    private NextGreaterElementI n = new NextGreaterElementI();

    @Test
    public void testNextGreaterElementICase1() {
        Assert.assertArrayEquals(new int[] {-1, 3, -1},
                n.nextGreaterElement(
                        new int[]{4, 1, 2},
                        new int[]{1, 3, 4, 2}
                        )
        );
    }

    @Test
    public void testNextGreaterElementICase2() {
        Assert.assertArrayEquals(new int[] {3, -1},
                n.nextGreaterElement(
                        new int[]{2, 4},
                        new int[]{1, 2, 3, 4}
                )
        );
    }

    @Test
    public void testNextGreaterElementICase3() {
        Assert.assertArrayEquals(new int[] {},
                n.nextGreaterElement(
                        new int[]{},
                        new int[]{}
                )
        );
    }

    @Test
    public void testNextGreaterElementICase4() {
        Assert.assertArrayEquals(new int[] {5, 2, 6, 9, 11, 3, 7},
                n.nextGreaterElement(
                        new int[]{3, 1, 5, 7, 9, 2, 6},
                        new int[]{1, 2, 3, 5, 6, 7, 9, 11}
                )
        );
    }
}
