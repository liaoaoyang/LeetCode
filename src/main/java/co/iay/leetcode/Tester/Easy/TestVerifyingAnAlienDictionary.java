package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.VerifyingAnAlienDictionary;
import org.junit.Assert;
import org.junit.Test;

public class TestVerifyingAnAlienDictionary {
    private VerifyingAnAlienDictionary v = new VerifyingAnAlienDictionary();

    @Test
    public void testVerifyingAnAlienDictionaryCase1() {
        Assert.assertTrue(
                v.isAlienSorted(
                        new String[]{"hello", "leetcode"},
                        "hlabcdefgijkmnopqrstuvwxyz"
                )
        );
    }

    @Test
    public void testVerifyingAnAlienDictionaryCase2() {
        Assert.assertFalse(
                v.isAlienSorted(
                        new String[]{"word", "world", "row"},
                        "worldabcefghijkmnpqstuvxyz"
                )
        );
    }

    @Test
    public void testVerifyingAnAlienDictionaryCase3() {
        Assert.assertFalse(
                v.isAlienSorted(
                        new String[]{"apple", "app"},
                        "abcdefghijklmnopqrstuvwxyz"
                )
        );
    }

    @Test
    public void testVerifyingAnAlienDictionaryCase4() {
        Assert.assertTrue(
                v.isAlienSorted(
                        new String[]{"kuvp", "q"},
                        "ngxlkthsjuoqcpavbfdermiywz"
                )
        );
    }

    @Test
    public void testVerifyingAnAlienDictionaryCase5() {
        Assert.assertFalse(
                v.isAlienSorted(
                        new String[]{"kxvyx", "ts"},
                        "tiwjpbemkhalsqzdvucorfgxyn"
                )
        );
    }
}
