package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ShortestDistanceToACharacter;
import org.junit.Assert;
import org.junit.Test;

public class TestShortestDistanceToACharacter {
    private ShortestDistanceToACharacter s = new ShortestDistanceToACharacter();

    @Test
    public void testShortestDistanceToACharacterCase1() {
        Assert.assertArrayEquals(new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0},
                s.shortestToChar("loveleetcode", 'e'));
    }
}
