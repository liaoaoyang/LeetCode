package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.LongestWordInDictionary;
import org.junit.Assert;
import org.junit.Test;

public class TestLongestWordInDictionary {
    private LongestWordInDictionary l = new LongestWordInDictionary();

    @Test
    public void testLongestWordInDictionaryCase1() {
        Assert.assertEquals("world", l.longestWord(new String[]{"w", "wo", "wor", "worl", "world"}));
    }

    @Test
    public void testLongestWordInDictionaryCase2() {
        Assert.assertEquals("apple", l.longestWord(new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"}));
    }

    @Test
    public void testLongestWordInDictionaryCase3() {
        Assert.assertEquals("latte",
                l.longestWord(new String[]{
                        "m", "mo", "moc", "moch", "mocha",
                        "l", "la", "lat", "latt", "latte",
                        "c", "ca", "cat"
                }));
    }

    @Test
    public void testLongestWordInDictionaryCase4() {
        Assert.assertEquals("", l.longestWord(new String[]{}));
    }

    @Test
    public void testLongestWordInDictionaryCase5() {
        Assert.assertEquals("yodn", l.longestWord(new String[]{
                "yo", "ew", "fc", "zrc", "yodn",
                "fcm", "qm", "qmo", "fcmz", "z",
                "ewq", "yod", "ewqz", "y"
        }));
    }

    @Test
    public void testLongestWordInDictionaryCase6() {
        Assert.assertEquals("oiddm", l.longestWord(new String[]{
                "k", "lg", "it", "oidd", "oid",
                "oiddm", "kfk", "y", "mw", "kf",
                "l", "o", "mwaqz", "oi", "ych",
                "m", "mwa"
        }));
    }
}
