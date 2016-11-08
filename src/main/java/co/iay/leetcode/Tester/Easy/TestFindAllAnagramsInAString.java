package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.FindAllAnagramsInAString;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ng on 16/11/8.
 */
public class TestFindAllAnagramsInAString {
    private FindAllAnagramsInAString t = new FindAllAnagramsInAString();

    @Test
    public void testFindAllAnagramsInAStringCase1() {
        List<Integer> r = new ArrayList<Integer>();
        r.add(0);
        r.add(6);
        Assert.assertEquals(r, t.findAnagrams("cbaebabacd", "abc"));
    }

    @Test
    public void testFindAllAnagramsInAStringCase2() {
        List<Integer> r = new ArrayList<Integer>();
        r.add(0);
        r.add(1);
        r.add(2);
        Assert.assertEquals(r, t.findAnagrams("abab", "ab"));
    }
}
