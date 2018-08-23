package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.UncommonWordsFromTwoSentences;
import org.junit.Assert;
import org.junit.Test;

public class TestUncommonWordsFromTwoSentences {
    private UncommonWordsFromTwoSentences u = new UncommonWordsFromTwoSentences();

    @Test
    public void testUncommonWordsFromTwoSentencesCase1() {
        Assert.assertArrayEquals(new String[]{"banana"},
                u.uncommonFromSentences(
                        "apple apple",
                        "banana"
                )
        );
    }

    @Test
    public void testUncommonWordsFromTwoSentencesCase2() {
        Assert.assertArrayEquals(new String[]{"sour", "sweet"},
                u.uncommonFromSentences(
                        "this apple is sweet",
                        "this apple is sour"
                )
        );
    }

    @Test
    public void testUncommonWordsFromTwoSentencesCase3() {
        Assert.assertArrayEquals(new String[]{"banana"},
                u.uncommonFromSentences(
                        "banana",
                        "apple apple"
                )
        );
    }
}
