package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.RevealCardsInIncreasingOrder;
import org.junit.Assert;
import org.junit.Test;

public class TestRevealCardsInIncreasingOrder {
    private RevealCardsInIncreasingOrder r = new RevealCardsInIncreasingOrder();

    @Test
    public void testRevealCardsInIncreasingOrderCase1() {
        Assert.assertArrayEquals(
                new int[]{2, 13, 3, 11, 5, 17, 7},
                r.deckRevealedIncreasing(
                        new int[]{17, 13, 11, 2, 3, 5, 7}
                )
        );
    }
}
