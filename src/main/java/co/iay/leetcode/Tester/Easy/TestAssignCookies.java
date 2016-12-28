package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.AssignCookies;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/12/28.
 */
public class TestAssignCookies {
    AssignCookies a = new AssignCookies();

    @Test
    public void testAssignCookiesCase1() {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        Assert.assertEquals(1, a.findContentChildren(g, s));
    }

    @Test
    public void testAssignCookiesCase2() {
        int[] g = {1, 2};
        int[] s = {1, 2, 3};
        Assert.assertEquals(2, a.findContentChildren(g, s));
    }

    @Test
    public void testAssignCookiesCase3() {
        int[] g = {2, 3};
        int[] s = {1, 1, 1};
        Assert.assertEquals(0, a.findContentChildren(g, s));
    }

    @Test
    public void testAssignCookiesCase4() {
        int[] g = {2, 3};
        int[] s = {};
        Assert.assertEquals(0, a.findContentChildren(g, s));
    }

    @Test
    public void testAssignCookiesCase5() {
        int[] g = {3, 2, 8};
        int[] s = {1, 9};
        Assert.assertEquals(1, a.findContentChildren(g, s));
    }
}
