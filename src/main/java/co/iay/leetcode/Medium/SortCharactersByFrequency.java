package co.iay.leetcode.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by ng on 2017/5/13.
 * 451. Sort Characters By Frequency
 * https://leetcode.com/problems/sort-characters-by-frequency/
 */
public class SortCharactersByFrequency {
    private class CharFreq {
        char character = 0;
        int frequency = 0;
    }

    private Comparator<CharFreq> cmp = new Comparator<CharFreq>() {
        @Override
        public int compare(CharFreq o1, CharFreq o2) {
        if (o1.frequency == o2.frequency) {
            return 0;
        }

        return o1.frequency < o2.frequency ? 1 : -1;
        }
    };

    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        char[] sc = s.toCharArray();
        List<CharFreq> cf = new ArrayList<CharFreq>();

        for (int i = 0; i < 256; ++i) {
            cf.add(new CharFreq());
        }

        for (char c : sc) {
            cf.get(c).character = c;
            cf.get(c).frequency++;
        }

        Collections.sort(cf, cmp);

        for (CharFreq c : cf) {
            if (c.frequency == 0) {
                continue;
            }

            for (int i = 0; i < c.frequency; ++i) {
                sb.append(c.character);
            }
        }

        return sb.toString();
    }
}
