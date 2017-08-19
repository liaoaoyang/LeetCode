package co.iay.leetcode.Algorithm;

import java.util.Random;
import java.util.Stack;

public class QuickSort {
    final static private int FROM_LEFT = 1;
    final static private int FROM_RIGHT = -1;
    final static private int PARTITION_FINISHED = 0;

    private static class Partition {
        private int begin;
        private int end;

        public Partition(int begin, int end) {
            this.begin = begin;
            this.end = end;
        }
    }

    public static <T extends Comparable> void swap(T[] array, int i, int j) {
        if (i < 0 || j >= array.length) {
            return;
        }

        T tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static <T extends Comparable> void recursiveSort(T[] array) {
        recursiveSort(array, 0, array.length - 1);
    }

    private static <T extends Comparable> int swapSmallerElementsWithPivot(T[] array, int begin, int end) {
        return swapSmallerElementsWithPivot(array, begin, end, end);
    }

    private static <T extends Comparable> int swapSmallerElementsWithPivot(T[] array, int begin, int end, int defaultPivotIndex) {
        if (begin == end) {
            return begin;
        }

        // 默认选取序列中最后一个元素作为基准值（即pivot）
        int pivotIndex = defaultPivotIndex;
        int now = begin;

        // 当判断元素已经是基准值时，说明基准值的左边都小于基准值，右边都大于基准值，分区完成
        while (now < pivotIndex) {
            // 遍历数组，数值小于基准值时，继续比较下一元素
            if (array[now].compareTo(array[pivotIndex]) < 0) {
                ++now;
                continue;
            }

            // 当前值大于等于基准值时，基准值与前一个元素交换位置，准备将基准值之后的空间用于存储当前值
            swap(array, pivotIndex - 1, pivotIndex);
            // 前移基准值的坐标，保持一致
            --pivotIndex;

            // 如果基准值的下标已经等于当前值的下标，说明交换前当前值位于基准值前一位
            // 由于已经进行了交换值，即已经完成了排序，已交换当前值到基准值的后一空间
            if (pivotIndex == now) {
                continue;
            }

            // 交换当前值到基准值的后一个空间，继续比较交换到当前值的坐标的值
            // 即先前基准值后一元素的值，继续执行上述比较过程
            swap(array, now, pivotIndex + 1);
        }

        return pivotIndex;
    }

    private static <T extends Comparable> int swapGreaterElementsWithPivot(T[] array, int begin, int end) {
        return swapGreaterElementsWithPivot(array, begin, end, begin);
    }

    private static <T extends Comparable> int swapGreaterElementsWithPivot(T[] array, int begin, int end, int defaultPivotIndex) {
        if (begin == end) {
            return begin;
        }

        int pivotIndex = defaultPivotIndex;
        int now = end;

        while (now > pivotIndex) {
            if (array[now].compareTo(array[pivotIndex]) > 0) {
                --now;
                continue;
            }

            swap(array, pivotIndex + 1, pivotIndex);
            ++pivotIndex;

            if (pivotIndex == now) {
                continue;
            }

            swap(array, now, pivotIndex - 1);
        }

        return pivotIndex;
    }

    private static <T extends Comparable> void recursiveSort(T[] array, int begin, int end) {
        // 只有一个元素时，必定是排序完成的
        if (begin >= end) {
            return;
        }

        int pivotIndex = swapSmallerElementsWithPivot(array, begin, end);

        // 对于已分区完成的情况，递归地对左右两个区域进行排序工作
        recursiveSort(array, begin, pivotIndex - 1);
        recursiveSort(array, pivotIndex + 1, end);
    }

    public static <T extends Comparable> void recursiveSortByRandomPickPivot(T[] array) {
        recursiveSortByRandomPickPivot(array, 0, array.length - 1);
    }

    private static <T extends Comparable> void recursiveSortByRandomPickPivot(T[] array, int begin, int end) {
        // 只有一个元素时，必定是排序完成的
        if (begin >= end) {
            return;
        }

        // 随机选取基准值，可以防止最坏情况的发生（已排序），思路类似选取最后一个作为基准值
        // 先从左到右进行一次处理，再从右到左进行一次处理
        Random r = new Random();
        int pivotIndex = r.nextInt(end - begin) + begin;
        int factor = FROM_LEFT;
        int now = begin;

        while (factor != PARTITION_FINISHED) {
            if ((now - pivotIndex) * factor >= 0) {
                if (factor == FROM_LEFT) {
                    now = end;
                    factor = FROM_RIGHT;
                } else {
                    factor = PARTITION_FINISHED;
                }

                continue;
            }

            int step = factor / Math.abs(factor);

            if (array[now].compareTo(array[pivotIndex]) * factor < 0) {
                now += step;
                continue;
            }

            swap(array, pivotIndex - step, pivotIndex);
            pivotIndex -= step;

            if ((now - pivotIndex) * factor >= 0) {
                if (factor == FROM_LEFT) {
                    now = end;
                    factor = FROM_RIGHT;
                } else {
                    factor = PARTITION_FINISHED;
                }

                continue;
            }

            swap(array, now, pivotIndex + step);
        }

        /*
        int left = begin;

        while (left < pivotIndex) {
            if (array[left].compareTo(array[pivotIndex]) < 0) {
                ++left;
                continue;
            }

            swap(array, pivotIndex - 1, pivotIndex);
            --pivotIndex;

            if (pivotIndex == left) {
                continue;
            }

            swap(array, left, pivotIndex + 1);
        }

        int right = end;

        while (right > pivotIndex) {
            if (array[right].compareTo(array[pivotIndex]) > 0) {
                --right;
                continue;
            }

            swap(array, pivotIndex + 1, pivotIndex);
            ++pivotIndex;

            if (pivotIndex == right) {
                continue;
            }

            swap(array, right, pivotIndex - 1);
        }
        */


        // 对于已分区完成的情况，递归地对左右两个区域进行排序工作
        recursiveSortByRandomPickPivot(array, begin, pivotIndex - 1);
        recursiveSortByRandomPickPivot(array, pivotIndex + 1, end);
    }

    public static <T extends Comparable> void nonRecursiveSort(T[] array) {
        nonRecursiveSort(array, 0, array.length - 1);
    }

    private static <T extends Comparable> void nonRecursiveSort(T[] array, int begin, int end) {
        Stack<Partition> partitions = new Stack<Partition>();
        int pivotIndex = swapSmallerElementsWithPivot(array, begin, end);

        if (pivotIndex > begin) {
            partitions.push(new Partition(begin, pivotIndex - 1));
        }

        if (pivotIndex < end) {
            partitions.push(new Partition(pivotIndex + 1, end));
        }

        while (!partitions.empty()) {
            Partition p = partitions.pop();
            int nowBegin = p.begin;
            int nowEnd = p.end;

            pivotIndex = swapSmallerElementsWithPivot(array, nowBegin, nowEnd);

            if (pivotIndex > nowBegin) {
                partitions.push(new Partition(nowBegin, pivotIndex - 1));
            }

            if (pivotIndex < nowEnd) {
                partitions.push(new Partition(pivotIndex + 1, nowEnd));
            }
        }

    }

    public static <T extends Comparable> void nonRecursiveSortByRandomPickPivot(T[] array) {
        nonRecursiveSortByRandomPickPivot(array, 0, array.length - 1);
    }

    private static <T extends Comparable> void nonRecursiveSortByRandomPickPivot(T[] array, int begin, int end) {
        if (array.length == 1) {
            return;
        }

        Stack<Partition> partitions = new Stack<Partition>();
        Random r = new Random();
        int pivotIndex = r.nextInt(end - begin) + begin;
        pivotIndex = swapSmallerElementsWithPivot(array, begin, end, pivotIndex);
        pivotIndex = swapGreaterElementsWithPivot(array, begin, end, pivotIndex);

        if (pivotIndex > begin) {
            partitions.push(new Partition(begin, pivotIndex - 1));
        }

        if (pivotIndex < end) {
            partitions.push(new Partition(pivotIndex + 1, end));
        }

        while (!partitions.empty()) {
            Partition p = partitions.pop();
            int nowBegin = p.begin;
            int nowEnd = p.end;

            if (nowBegin >= nowEnd) {
                continue;
            }

            pivotIndex = r.nextInt(nowEnd - nowBegin) + nowBegin;
            pivotIndex = swapSmallerElementsWithPivot(array, nowBegin, nowEnd, pivotIndex);
            pivotIndex = swapGreaterElementsWithPivot(array, nowBegin, nowEnd, pivotIndex);

            if (pivotIndex > nowBegin) {
                partitions.push(new Partition(nowBegin, pivotIndex - 1));
            }

            if (pivotIndex < nowEnd) {
                partitions.push(new Partition(pivotIndex + 1, nowEnd));
            }
        }

    }
}
