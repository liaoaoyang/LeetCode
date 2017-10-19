package co.iay.leetcode.Algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 小顶堆
 */
public class MinHeap {
    protected List<Comparable> heap;

    public MinHeap() {
        heap = new ArrayList<Comparable>();
    }

    protected void swap(int i, int j) {
        if (!(i >= 0 && i < heap.size() && j >= 0 && j < heap.size())) {
            return;
        }

        Comparable tmp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, tmp);
    }

    protected void adjust() {
        for (int i = heap.size() / 2; i >= 0; ) {
            if (i * 2 + 1 < heap.size() && heap.get(i).compareTo(heap.get(i * 2 + 1)) > 0) {
                swap(i, i * 2 + 1);
                continue;
            }

            if (i * 2 + 2 < heap.size() && heap.get(i).compareTo(heap.get(i * 2 + 2)) > 0) {
                swap(i, i * 2 + 2);
                continue;
            }

            --i;
        }
    }

    public int add(Comparable v) {
        heap.add(v);
        adjust();

        return heap.size();
    }

    public Comparable top() {
        return heap == null || heap.size() == 0 ? null : heap.get(0);
    }

    public Comparable pop() {
        if (heap == null || heap.size() == 0) {
            return null;
        }

        Comparable heapTop = heap.get(0);
        heap.remove(0);
        adjust();

        return heapTop;
    }

    @Override
    public String toString() {
        if (null == heap || heap.size() == 0) {
            return "empty";
        }

        StringBuilder sb = new StringBuilder();
        for (Comparable c : heap) {
            sb.append(c.toString() + "->");
        }

        sb.append("END");

        return sb.toString();
    }
}
