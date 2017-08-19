package co.iay.leetcode.Tester.Algorithm;

import co.iay.leetcode.Algorithm.QuickSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestQuickSort {
    private void testQuickSortOfArrayWithSize(int arraySize) {
        Integer[] result = new Integer[arraySize];

        for (int i = 0; i < result.length; ++i) {
            result[i] = i + 1;
        }

        Integer[] array = new Integer[arraySize];

        for (int i = 0; i < array.length; ++i) {
            array[i] = i + 1;
        }

        List<Integer> arrayList = Arrays.asList(array);

        Collections.shuffle(arrayList);
        arrayList.toArray(array);
        QuickSort.recursiveSort(array);
        Assert.assertArrayEquals(result, array);

        Collections.shuffle(arrayList);
        arrayList.toArray(array);
        QuickSort.recursiveSortByRandomPickPivot(array);
        Assert.assertArrayEquals(result, array);

        Collections.shuffle(arrayList);
        arrayList.toArray(array);
        QuickSort.nonRecursiveSort(array);
        Assert.assertArrayEquals(result, array);

        Collections.shuffle(arrayList);
        arrayList.toArray(array);
        QuickSort.nonRecursiveSortByRandomPickPivot(array);
        Assert.assertArrayEquals(result, array);
    }

    @Test
    public void testQuickSortCase1() {
        testQuickSortOfArrayWithSize(1);
    }

    @Test
    public void testQuickSortCase2() {
        testQuickSortOfArrayWithSize(2);
    }

    @Test
    public void testQuickSortCase3() {
        testQuickSortOfArrayWithSize(3);
    }

    @Test
    public void testQuickSortCase4() {
        testQuickSortOfArrayWithSize(4);
    }

    @Test
    public void testQuickSortCase5() {
        testQuickSortOfArrayWithSize(100);
    }

    @Test
    public void testQuickSortCase6() {
        Integer[] array = new Integer[]{2, 1};
        QuickSort.swap(array, 0, 1);
        Assert.assertArrayEquals(new Integer[]{1, 2}, array);
    }


}
