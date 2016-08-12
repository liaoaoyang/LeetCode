package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.RansomNote;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/8/12.
 */
public class TestRansomNote {
    private RansomNote ransomNote = new RansomNote();

    @Test
    public void testRansomNoteCase1()
    {
        Assert.assertEquals(false, ransomNote.canConstruct("a", "b"));
    }

    @Test
    public void testRansomNoteCase2()
    {
        Assert.assertEquals(false, ransomNote.canConstruct("aa", "ab"));
    }

    @Test
    public void testRansomNoteCase3()
    {
        Assert.assertEquals(true, ransomNote.canConstruct("aa", "aab"));
    }
}
