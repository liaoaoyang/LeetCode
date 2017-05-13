package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.SortCharactersByFrequency;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 2017/5/13.
 */
public class TestSortCharactersByFrequency {
    private SortCharactersByFrequency s = new SortCharactersByFrequency();

    @Test
    public void testSortCharactersByFrequencyCase1() {
        Assert.assertEquals("eert", s.frequencySort("tree"));
    }

    @Test
    public void testSortCharactersByFrequencyCase2() {
        Assert.assertEquals("aaaccc", s.frequencySort("cccaaa"));
    }

    @Test
    public void testSortCharactersByFrequencyCase3() {
        Assert.assertEquals("bbAa", s.frequencySort("Aabb"));
    }

    @Test
    public void testSortCharactersByFrequencyCase4() {
        Assert.assertEquals("sssssssffffff44444aaaa5552", s.frequencySort("a554442f544asfasssffffasss"));
    }

    @Test
    public void testSortCharactersByFrequencyCase5() {
        Assert.assertEquals("          sssssssffffff44444aaaa5552", s.frequencySort("a554442f544asfasssffffasss          "));
    }

    @Test
    public void testSortCharactersByFrequencyCase6() {
        Assert.assertEquals("aaacccbbd", s.frequencySort("cccaabadb"));
    }
}
