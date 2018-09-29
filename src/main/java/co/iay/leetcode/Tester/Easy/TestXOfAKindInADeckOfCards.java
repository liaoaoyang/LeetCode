package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.XOfAKindInADeckOfCards;
import org.junit.Assert;
import org.junit.Test;

public class TestXOfAKindInADeckOfCards {
    private XOfAKindInADeckOfCards x = new XOfAKindInADeckOfCards();

    @Test
    public void testXOfAKindInADeckOfCardsCase1() {
        Assert.assertTrue(x.hasGroupsSizeX(new int[]{
                1, 2, 3, 1, 2, 3, 1, 2, 3
        }));
    }

    @Test
    public void testXOfAKindInADeckOfCardsCase2() {
        Assert.assertTrue(x.hasGroupsSizeX(new int[]{
                1, 2, 3, 1, 2, 3
        }));
    }

    @Test
    public void testXOfAKindInADeckOfCardsCase3() {
        Assert.assertTrue(x.hasGroupsSizeX(new int[]{
                1, 0, 1, 0, 1, 0, 1, 0, 1, 0
        }));
    }

    @Test
    public void testXOfAKindInADeckOfCardsCase4() {
        Assert.assertTrue(x.hasGroupsSizeX(new int[]{
                1, 1
        }));
    }

    @Test
    public void testXOfAKindInADeckOfCardsCase5() {
        Assert.assertTrue(x.hasGroupsSizeX(new int[]{
                1, 1, 1
        }));
    }

    @Test
    public void testXOfAKindInADeckOfCardsCase6() {
        Assert.assertFalse(x.hasGroupsSizeX(new int[]{
                1
        }));
    }
}
