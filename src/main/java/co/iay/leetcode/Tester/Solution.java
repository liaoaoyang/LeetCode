package co.iay.leetcode.Tester;

import java.util.Comparator;
import java.util.List;

/**
 * Created by ng on 16/4/16.
 */
public class Solution {
    final public static Comparator<List<Integer>> comparator = new Comparator<List<Integer>>() {
        @Override
        public int compare(List<Integer> o1, List<Integer> o2) {
            if (o1.size() == o2.size()) {
                for (int i = 0; i < o1.size(); ++i) {
                    if (o1.get(i).equals(o2.get(i))) {
                        continue;
                    }

                    return o1.get(i) > o2.get(i) ? 1 : -1;
                }

                return 0;
            }

            return o1.size() > o2.size() ? 1 : -1;
        }
    };

    public static void main(String[] args) {
        System.out.println("Tester running...");
    }
}
