package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.UniqueMorseCodeWords;
import org.junit.Assert;
import org.junit.Test;

public class TestUniqueMorseCodeWords {
    private UniqueMorseCodeWords u = new UniqueMorseCodeWords();

    @Test
    public void testUniqueMorseCodeWordsCase1() {
        Assert.assertEquals(
                2,
                u.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"})
        );
    }
}
