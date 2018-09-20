package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.GroupsOfSpecialEquivalentStrings;
import org.junit.Assert;
import org.junit.Test;

public class TestGroupsOfSpecialEquivalentStrings {
    private GroupsOfSpecialEquivalentStrings g = new GroupsOfSpecialEquivalentStrings();

    @Test
    public void testGroupsOfSpecialEquivalentStringsCase1() {
        Assert.assertEquals(3, g.numSpecialEquivGroups(new String[]{
                "a",
                "b",
                "c",
                "a",
                "c",
                "c"
        }));
    }

    @Test
    public void testGroupsOfSpecialEquivalentStringsCase2() {
        Assert.assertEquals(4, g.numSpecialEquivGroups(new String[]{
                "aa",
                "bb",
                "ab",
                "ba"
        }));
    }

    @Test
    public void testGroupsOfSpecialEquivalentStringsCase3() {
        Assert.assertEquals(3, g.numSpecialEquivGroups(new String[]{
                "abc",
                "acb",
                "bac",
                "bca",
                "cab",
                "cba"
        }));
    }

    @Test
    public void testGroupsOfSpecialEquivalentStringsCase4() {
        Assert.assertEquals(1, g.numSpecialEquivGroups(new String[]{
                "abcd",
                "cdab",
                "adcb",
                "cbad"
        }));
    }
}
