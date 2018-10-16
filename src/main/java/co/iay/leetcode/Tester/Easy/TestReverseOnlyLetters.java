package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ReverseOnlyLetters;
import org.junit.Assert;
import org.junit.Test;

public class TestReverseOnlyLetters {
    private ReverseOnlyLetters r = new ReverseOnlyLetters();

    @Test
    public void testReverseOnlyLettersCase1() {
        Assert.assertEquals("dc-ba", r.reverseOnlyLetters("ab-cd"));
    }

    @Test
    public void testReverseOnlyLettersCase2() {
        Assert.assertEquals("j-Ih-gfE-dCba", r.reverseOnlyLetters("a-bC-dEf-ghIj"));
    }

    @Test
    public void testReverseOnlyLettersCase3() {
        Assert.assertEquals("Qedo1ct-eeLg=ntse-T!", r.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    @Test
    public void testReverseOnlyLettersCase4() {
        Assert.assertEquals("", r.reverseOnlyLetters(""));
    }
}
