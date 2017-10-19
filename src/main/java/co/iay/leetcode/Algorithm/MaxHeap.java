package co.iay.leetcode.Algorithm;

public class MaxHeap extends MinHeap {
    @Override
    protected void adjust() {
        for (int i = heap.size() / 2; i >= 0; ) {
            if (i * 2 + 1 < heap.size() && heap.get(i).compareTo(heap.get(i * 2 + 1)) < 0) {
                swap(i, i * 2 + 1);
                continue;
            }

            if (i * 2 + 2 < heap.size() && heap.get(i).compareTo(heap.get(i * 2 + 2)) < 0) {
                swap(i, i * 2 + 2);
                continue;
            }

            --i;
        }
    }
}
