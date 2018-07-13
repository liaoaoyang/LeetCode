package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.LongestWordInDictionaryThroughDeleting;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestLongestWordInDictionaryThroughDeleting {
    private LongestWordInDictionaryThroughDeleting l = new LongestWordInDictionaryThroughDeleting();

    @Test
    public void testLongestWordInDictionaryThroughDeletingCase1() {
        Assert.assertEquals("apple",
                l.findLongestWord("abpcplea", Arrays.asList(
                        "ale", "apple", "monkey", "plea"
                )));
    }

    @Test
    public void testLongestWordInDictionaryThroughDeletingCase2() {
        Assert.assertEquals("plea",
                l.findLongestWord("abpcplea", Arrays.asList(
                        "ale", "ppale", "monkey", "plea"
                )));
    }

    @Test
    public void testLongestWordInDictionaryThroughDeletingCase3() {
        Assert.assertEquals("a",
                l.findLongestWord("abpcplea", Arrays.asList(
                        "a", "b", "c"
                )));
    }

    @Test
    public void testLongestWordInDictionaryThroughDeletingCase4() {
        Assert.assertEquals("",
                l.findLongestWord("abpcplea", Arrays.asList(
                        "x", "y", "z"
                )));
    }
}
