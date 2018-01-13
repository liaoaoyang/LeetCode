package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.FindAnagramMappings;
import org.junit.Assert;
import org.junit.Test;

public class TestFindAnagramMappings {
    private FindAnagramMappings f = new FindAnagramMappings();

    @Test
    public void testFindAnagramMappingsCase1() {
        Assert.assertArrayEquals(new int[]{1, 4, 3, 2, 0},
                f.anagramMappings(
                        new int[]{12, 28, 46, 32, 50},
                        new int[]{50, 12, 32, 46, 28}
                ));
    }

    @Test
    public void testFindAnagramMappingsCase2() {
        Assert.assertArrayEquals(new int[]{1, 3, 4, 5, 2, 0},
                f.anagramMappings(
                        new int[]{12, 28, 46, 28, 32, 50},
                        new int[]{50, 12, 32, 28, 46, 28}
                ));
    }
}
