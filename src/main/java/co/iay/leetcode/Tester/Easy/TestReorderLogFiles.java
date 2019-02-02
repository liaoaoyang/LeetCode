package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ReorderLogFiles;
import org.junit.Assert;
import org.junit.Test;

public class TestReorderLogFiles {
    private ReorderLogFiles r = new ReorderLogFiles();

    @Test
    public void testReorderLogFilesCase1() {
        String[] input = new String[]{
                "a1 9 2 3 1",
                "g1 act car",
                "zo4 4 7",
                "ab1 off key dog",
                "a8 act zoo",
        };

        String[] expect = new String[]{
                "g1 act car",
                "a8 act zoo",
                "ab1 off key dog",
                "a1 9 2 3 1",
                "zo4 4 7",
        };

        String[] output = r.reorderLogFiles(input);

        Assert.assertArrayEquals(expect, output);
    }
}
