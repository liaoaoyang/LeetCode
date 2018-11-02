package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.LongPressedName;
import org.junit.Assert;
import org.junit.Test;

public class TestLongPressedName {
    private LongPressedName l = new LongPressedName();

    @Test
    public void testLongPressedNameCase1() {
        Assert.assertTrue(l.isLongPressedName("alex", "aaleex"));
    }

    @Test
    public void testLongPressedNameCase2() {
        Assert.assertFalse(l.isLongPressedName("ab", "aaxbb"));
    }

    @Test
    public void testLongPressedNameCase3() {
        Assert.assertFalse(l.isLongPressedName("plpkoh", "plppkkh"));
    }

    @Test
    public void testLongPressedNameCase4() {
        Assert.assertFalse(l.isLongPressedName("ab", "bb"));
    }

    @Test
    public void testLongPressedNameCase5() {
        Assert.assertTrue(l.isLongPressedName("ab", "aabb"));
    }

    @Test
    public void testLongPressedNameCase6() {
        Assert.assertFalse(l.isLongPressedName("ab", "aabbcc"));
    }

    @Test
    public void testLongPressedNameCase7() {
        Assert.assertFalse(l.isLongPressedName("pyplrz", "ppyypllr"));
    }

    @Test
    public void testLongPressedNameCase8() {
        Assert.assertFalse(l.isLongPressedName("abc", "abd"));
    }
}
