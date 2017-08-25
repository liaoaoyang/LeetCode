package co.iay.leetcode.Tester.Algorithm;

import co.iay.leetcode.Algorithm.QuickSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestQuickSort {
    private void testQuickSortOfArrayWithSize(int arraySize) {
        testQuickSortOfArrayWithSize(arraySize, false);
    }
    private void testQuickSortOfArrayWithSize(int arraySize, boolean printTime) {
        System.out.print(printTime ? "=========> QuickSort begin <=========\n" : "");
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
        Integer[] array1 = arrayList.toArray(new Integer[arraySize]);
        long beginTime = System.nanoTime();
        QuickSort.recursiveSort(array1);
        System.out.print(printTime ? "QuickSort.recursiveSort used " + (System.nanoTime() - beginTime) + "\n" : "");
        Assert.assertArrayEquals(result, array1);

        Integer[] array2 = arrayList.toArray(new Integer[arraySize]);
        beginTime = System.nanoTime();
        QuickSort.recursiveSortByRandomPickPivot(array2);
        System.out.print(printTime ? "QuickSort.recursiveSortByRandomPickPivot used " + (System.nanoTime() - beginTime) + "\n" : "");
        Assert.assertArrayEquals(result, array2);

        Integer[] array3 = arrayList.toArray(new Integer[arraySize]);
        beginTime = System.nanoTime();
        QuickSort.nonRecursiveSort(array3);
        System.out.print(printTime ? "QuickSort.nonRecursiveSort used " + (System.nanoTime() - beginTime) + "\n" : "");
        Assert.assertArrayEquals(result, array3);

        Integer[] array4 = arrayList.toArray(new Integer[arraySize]);
        beginTime = System.nanoTime();
        QuickSort.nonRecursiveSortByRandomPickPivot(array4);
        System.out.print(printTime ? "QuickSort.nonRecursiveSortByRandomPickPivot used " + (System.nanoTime() - beginTime) + "\n" : "");
        Assert.assertArrayEquals(result, array4);

        System.out.print(printTime ? "==========> QuickSort end <==========\n" : "");
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
