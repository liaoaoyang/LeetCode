package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.MaximumAverageSubarrayI;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 2017/7/19.
 */
public class TestMaximumAverageSubarrayI {
    final private double REGARD_AS_SAME = 0.00001;
    private MaximumAverageSubarrayI m = new MaximumAverageSubarrayI();

    @Test
    public void testMaximumAverageSubarrayICase1() {
        Assert.assertEquals(12.75, m.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4),
                REGARD_AS_SAME);
    }

    @Test
    public void testMaximumAverageSubarrayICase2() {
        Assert.assertEquals(7, m.findMaxAverage(new int[]{7, 4, 5, 8, 8, 3, 9, 8, 7, 6}, 7),
                REGARD_AS_SAME);
    }

    @Test
    public void testMaximumAverageSubarrayICase3() {
        Assert.assertEquals(Integer.MIN_VALUE, m.findMaxAverage(new int[]{7, 3, 5}, 7),
                REGARD_AS_SAME);
    }

    @Test
    public void testMaximumAverageSubarrayICase4() {
        Assert.assertEquals(37.25556, m.findMaxAverage(new int[]{-6662, 5432, -8558, -8935, 8731, -3083, 4115, 9931, -4006, -3284, -3024, 1714, -2825, -2374, -2750, -959, 6516, 9356, 8040, -2169, -9490, -3068, 6299, 7823, -9767, 5751, -7897, 6680, -1293, -3486, -6785, 6337, -9158, -4183, 6240, -2846, -2588, -5458, -9576, -1501, -908, -5477, 7596, -8863, -4088, 7922, 8231, -4928, 7636, -3994, -243, -1327, 8425, -3468, -4218, -364, 4257, 5690, 1035, 6217, 8880, 4127, -6299, -1831, 2854, -4498, -6983, -677, 2216, -1938, 3348, 4099, 3591, 9076, 942, 4571, -4200, 7271, -6920, -1886, 662, 7844, 3658, -6562, -2106, -296, -3280, 8909, -8352, -9413, 3513, 1352, -8825}, 90),
                REGARD_AS_SAME);
    }
}
