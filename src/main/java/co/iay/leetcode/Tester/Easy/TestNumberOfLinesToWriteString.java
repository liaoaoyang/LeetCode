package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.NumberOfLinesToWriteString;
import org.junit.Assert;
import org.junit.Test;

public class TestNumberOfLinesToWriteString {
    private NumberOfLinesToWriteString n = new NumberOfLinesToWriteString();

    @Test
    public void testNumberOfLinesToWriteStringCase1() {
        Assert.assertArrayEquals(new int[]{3, 60},
                n.numberOfLines(
                        new int[]{
                                10, 10, 10, 10, 10,
                                10, 10, 10, 10, 10,
                                10, 10, 10, 10, 10,
                                10, 10, 10, 10, 10,
                                10, 10, 10, 10, 10,
                                10},
                        "abcdefghijklmnopqrstuvwxyz"
                )
        );
    }

    @Test
    public void testNumberOfLinesToWriteStringCase2() {
        Assert.assertArrayEquals(new int[]{2, 4},
                n.numberOfLines(
                        new int[]{
                                4, 10, 10, 10, 10,
                                10, 10, 10, 10, 10,
                                10, 10, 10, 10, 10,
                                10, 10, 10, 10, 10,
                                10, 10, 10, 10, 10,
                                10
                        },
                        "bbbcccdddaaa"
                )
        );
    }
}
