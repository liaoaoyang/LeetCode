package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.FindCommonCharacters;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestFindCommonCharacters {
    private FindCommonCharacters f = new FindCommonCharacters();

    @Test
    public void testFindCommonCharactersCase1() {
        Assert.assertEquals(
                Arrays.asList("e", "l", "l"),
                f.commonChars(new String[]{"bella", "label", "roller"})
        );
    }

    @Test
    public void testFindCommonCharactersCase2() {
        Assert.assertEquals(
                Arrays.asList("c", "o"),
                f.commonChars(new String[]{"cool", "lock", "cook"})
        );
    }
}
