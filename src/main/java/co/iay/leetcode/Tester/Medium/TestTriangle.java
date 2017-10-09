package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.Triangle;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestTriangle {
    private Triangle t = new Triangle();

    @Test
    public void testTriangleCase1() {
        List<List<Integer>> tri = new ArrayList<List<Integer>>();
        tri.add(Arrays.asList(2));
        tri.add(Arrays.asList(3, 4));
        tri.add(Arrays.asList(6, 5, 7));
        tri.add(Arrays.asList(4, 1, 8, 3));
        Assert.assertEquals(11, t.minimumTotal(tri));
    }

    @Test
    public void testTriangleCase2() {
        List<List<Integer>> tri = new ArrayList<List<Integer>>();
        tri.add(Arrays.asList(2));
        Assert.assertEquals(2, t.minimumTotal(tri));
    }
}
