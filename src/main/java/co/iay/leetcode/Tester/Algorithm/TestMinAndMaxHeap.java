package co.iay.leetcode.Tester.Algorithm;

import co.iay.leetcode.Algorithm.MaxHeap;
import co.iay.leetcode.Algorithm.MinHeap;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestMinAndMaxHeap {
    private void testBySize(int size, boolean minHeap) {
        MinHeap m = minHeap ? new MinHeap() : new MaxHeap();

        List<Integer> input = new ArrayList<Integer>();
        List<Integer> input4Compare = new ArrayList<Integer>();

        for (int i = 0; i < size; ++i) {
            input.add(i + 1);
            input4Compare.add(i + 1);
        }

        Collections.shuffle(input);

        for (int i = 0; i < size; ++i) {
            m.add(input.get(i));
        }

        Comparable top = m.top();

        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < size; ++i) {
            result.add((Integer) m.pop());
        }

        if (!minHeap) {
            Collections.sort(input4Compare, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    if (o1.equals(o2)) {
                        return 0;
                    }

                    return o1.compareTo(o2) > 0 ? -1 : 01;
                }
            });
        }

        Assert.assertEquals(input4Compare.get(0), top);
        Assert.assertEquals(input4Compare, result);
    }

    @Test
    public void testMinHeapCase1() {
        testBySize(10, true);
    }

    @Test
    public void testMinHeapCase2() {
        testBySize(100, true);
    }

    @Test
    public void testMaxHeapCase1() {
        testBySize(10, false);
    }

    @Test
    public void testMaxHeapCase2() {
        testBySize(100, false);
    }
}
