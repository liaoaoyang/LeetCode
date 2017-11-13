package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.OneBitAndTwoBitCharacters;
import org.junit.Assert;
import org.junit.Test;

public class TestOneBitAndTwoBitCharacters {
    private OneBitAndTwoBitCharacters o = new OneBitAndTwoBitCharacters();

    @Test
    public void testOneBitAndTwoBitCharactersCase1() {
        Assert.assertEquals(true, o.isOneBitCharacter(new int[]{1, 0, 0}));
    }

    @Test
    public void testOneBitAndTwoBitCharactersCase2() {
        Assert.assertEquals(false, o.isOneBitCharacter(new int[]{1, 1, 1, 0}));
    }

    @Test
    public void testOneBitAndTwoBitCharactersCase3() {
        Assert.assertEquals(true, o.isOneBitCharacter(new int[]{0, 1, 0, 0}));
    }

    @Test
    public void testOneBitAndTwoBitCharactersCase4() {
        Assert.assertEquals(true, o.isOneBitCharacter(new int[]{0, 1, 0, 0}));
    }

    @Test
    public void testOneBitAndTwoBitCharactersCase5() {
        Assert.assertEquals(true, o.isOneBitCharacter(new int[]{0, 0}));
    }
}
