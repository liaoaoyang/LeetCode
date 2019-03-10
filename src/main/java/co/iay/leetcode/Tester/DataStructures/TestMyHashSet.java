package co.iay.leetcode.Tester.DataStructures;

import co.iay.leetcode.DataStructures.MyHashSet;
import org.junit.Assert;
import org.junit.Test;

public class TestMyHashSet {
    @Test
    public void testCase1() {
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(1);
        hashSet.add(2);
        Assert.assertTrue(hashSet.contains(1));    // returns true
        Assert.assertFalse(hashSet.contains(3));    // returns false (not found)
        hashSet.add(2);
        Assert.assertTrue(hashSet.contains(2));    // returns true
        hashSet.remove(2);
        Assert.assertFalse(hashSet.contains(2));    // returns false (already removed)
        hashSet.add(1000000);
        Assert.assertTrue(hashSet.contains(1000000));
        hashSet.add(1000000 - 1);
        Assert.assertTrue(hashSet.contains(1000000 - 1));
        hashSet.remove(1000000);
        Assert.assertTrue(hashSet.contains(1000000 - 1));
    }
}
