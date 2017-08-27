package co.iay.leetcode.Medium;

import java.util.*;

/**
 * Created by ng on 17/5/1.
 * 347. Top K Frequent Elements
 * https://leetcode.com/problems/top-k-frequent-elements/
 */
public class TopKFrequentElements {
    private class Frequency {
        public int value = 0;
        public int frequency = 0;

        public Frequency(int value, int frequency) {
            this.value = value;
            this.frequency = frequency;
        }

        @Override
        public String toString() {
            return "[" + value + "," + frequency + "]";
        }
    }

    private Comparator<Frequency> comparator = new Comparator<Frequency>() {
        @Override
        public int compare(Frequency o1, Frequency o2) {
            if (o1.frequency < o2.frequency) {
                return 1;
            } else if (o1.frequency == o2.frequency) {
                return (o1.value < o2.value ? 1 : -1);
            }

            return -1;
        }
    };

    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<Integer>(k);
        List<Frequency> comp = new ArrayList<Frequency>(k + 1);
        Map<Integer, Integer> numsFreq = new HashMap<Integer, Integer>();

        for (int n : nums) {
            if (!numsFreq.containsKey(n)) {
                numsFreq.put(n, 0);
            }

            numsFreq.put(n, numsFreq.get(n) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : numsFreq.entrySet()) {
            Frequency f = new Frequency(entry.getKey(), entry.getValue());

            if (comp.size() < k - 1) {
                comp.add(f);
                continue;
            }

            if (comp.size() == k - 1) {
                comp.add(f);
                comp.add(new Frequency(0, 0));
                Collections.sort(comp, comparator);
                continue;
            }

            if (entry.getValue() > comp.get(k).frequency) {
                comp.set(k, f);
                Collections.sort(comp, comparator);
                comp.set(k, new Frequency(0, 0));
            }
        }

        for (int i = 0; i < k; ++i) {
            result.add(comp.get(i).value);
        }

        Collections.sort(result);

        return result;
    }
}
