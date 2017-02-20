package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.RelativeRanks;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/2/18.
 */
public class TestRelativeRanks {
    private RelativeRanks r = new RelativeRanks();

    @Test
    public void testRelativeRanksCase1() {
        Assert.assertArrayEquals(new String[] {RelativeRanks.BRONZE, "4", "5", RelativeRanks.SILVER, RelativeRanks.GOLD},
                r.findRelativeRanks(new int[]{3, 2, 1, 4, 6}));
    }
}
