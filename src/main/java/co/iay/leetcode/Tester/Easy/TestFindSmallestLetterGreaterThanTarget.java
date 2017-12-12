package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.FindSmallestLetterGreaterThanTarget;
import org.junit.Assert;
import org.junit.Test;

public class TestFindSmallestLetterGreaterThanTarget {
    private FindSmallestLetterGreaterThanTarget f = new FindSmallestLetterGreaterThanTarget();

    @Test
    public void testFindSmallestLetterGreaterThanTargetCase1() {
        Assert.assertEquals('c', f.nextGreatestLetter(
                new char[]{'c', 'f', 'j'},
                'a'
        ));
    }

    @Test
    public void testFindSmallestLetterGreaterThanTargetCase2() {
        Assert.assertEquals('f', f.nextGreatestLetter(
                new char[]{'c', 'f', 'j'},
                'c'
        ));
    }

    @Test
    public void testFindSmallestLetterGreaterThanTargetCase3() {
        Assert.assertEquals('f', f.nextGreatestLetter(
                new char[]{'c', 'f', 'j'},
                'd'
        ));
    }

    @Test
    public void testFindSmallestLetterGreaterThanTargetCase4() {
        Assert.assertEquals('j', f.nextGreatestLetter(
                new char[]{'c', 'f', 'j'},
                'g'
        ));
    }

    @Test
    public void testFindSmallestLetterGreaterThanTargetCase5() {
        Assert.assertEquals('c', f.nextGreatestLetter(
                new char[]{'c', 'f', 'j'},
                'j'
        ));
    }

    @Test
    public void testFindSmallestLetterGreaterThanTargetCase6() {
        Assert.assertEquals('c', f.nextGreatestLetter(
                new char[]{'c', 'f', 'j'},
                'k'
        ));
    }

    @Test
    public void testFindSmallestLetterGreaterThanTargetCase7() {
        Assert.assertEquals('f', f.nextGreatestLetter(
                new char[]{'c', 'f', 'f', 'j'},
                'd'
        ));
    }
}
