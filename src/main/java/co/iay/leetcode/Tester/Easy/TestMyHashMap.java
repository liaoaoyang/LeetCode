package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.DataStructures.MyHashMap;
import org.junit.Assert;
import org.junit.Test;

public class TestMyHashMap {
    @Test
    public void testCase1() {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        Assert.assertEquals(1, hashMap.get(1)); // returns 1
        Assert.assertEquals(-1, hashMap.get(3)); // returns -1 (not found)
        hashMap.put(2, 1);                               // update the existing value
        Assert.assertEquals(1, hashMap.get(2)); // returns 1
        hashMap.remove(2);                          // remove the mapping for 2
        Assert.assertEquals(-1, hashMap.get(2)); // returns -1 (not found)
    }
}
