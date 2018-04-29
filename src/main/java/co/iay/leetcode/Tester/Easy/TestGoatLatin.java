package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.GoatLatin;
import org.junit.Assert;
import org.junit.Test;

public class TestGoatLatin {
    private GoatLatin g = new GoatLatin();

    @Test
    public void testGoatLatinCase1() {
        Assert.assertEquals(
                "Imaa peaksmaaa oatGmaaaa atinLmaaaaa",
                g.toGoatLatin("I speak Goat Latin")
        );
    }

    @Test
    public void testGoatLatinCase2() {
        Assert.assertEquals(
                "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa",
                g.toGoatLatin("The quick brown fox jumped over the lazy dog")
        );
    }
}
