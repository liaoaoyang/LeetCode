package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.FirstUniqueCharacterInAString;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/8/28.
 */
public class TestFirstUniqueCharacterInAString {
    private FirstUniqueCharacterInAString f = new FirstUniqueCharacterInAString();

    @Test
    public void testFirstUniqueCharacterInAStringCase1() {
        Assert.assertEquals(0, f.firstUniqChar("leetcode"));
    }

    @Test
    public void testFirstUniqueCharacterInAStringCase2() {
        Assert.assertEquals(2, f.firstUniqChar("loveleetcode"));
    }

    @Test
    public void testFirstUniqueCharacterInAStringCase3() {
        Assert.assertEquals(14, f.firstUniqChar("aaaaaabbbbbbccd"));
    }

    @Test
    public void testFirstUniqueCharacterInAStringCase4() {
        Assert.assertEquals(12, f.firstUniqChar("aaaaaabbbbbbcdd"));
    }
}
