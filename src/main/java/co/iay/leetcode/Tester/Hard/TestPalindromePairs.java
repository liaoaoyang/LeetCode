package co.iay.leetcode.Tester.Hard;

import co.iay.leetcode.Hard.PalindromePairs;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class TestPalindromePairs {
    private PalindromePairs p = new PalindromePairs();
    private Comparator<List<Integer>> cmp = new Comparator<List<Integer>>() {
        @Override
        public int compare(List<Integer> o1, List<Integer> o2) {
            if (o1.size() >= 2 && o2.size() >= 2) {
                if (o1.get(0).equals(o2.get(0))) {
                    return o1.get(1) > o2.get(1) ? 1 : -1;
                }

                return o1.get(0) > o2.get(0) ? 1 : -1;
            }

            return 0;
        }
    };

    @Test
    public void testPalindromePairsCase1() {
        List<List<Integer>> expect = new ArrayList<List<Integer>>();
        expect.add(Arrays.asList(0, 1));
        expect.add(Arrays.asList(1, 0));
        expect.add(Arrays.asList(3, 2));
        expect.add(Arrays.asList(2, 4));
        List<List<Integer>> result = p.palindromePairs(new String[]{"abcd", "dcba", "lls", "s", "sssll"});
        Collections.sort(expect, cmp);
        Collections.sort(result, cmp);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void testPalindromePairsCase2() {
        List<List<Integer>> expect = new ArrayList<List<Integer>>();
        expect.add(Arrays.asList(0, 1));
        expect.add(Arrays.asList(1, 0));
        List<List<Integer>> result = p.palindromePairs(new String[]{"a", ""});
        Collections.sort(expect, cmp);
        Collections.sort(result, cmp);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void testPalindromePairsCase3() {
        List<List<Integer>> expect = new ArrayList<List<Integer>>();
        expect.add(Arrays.asList(1, 3));
        expect.add(Arrays.asList(3, 0));
        expect.add(Arrays.asList(2, 4));
        expect.add(Arrays.asList(4, 0));
        expect.add(Arrays.asList(5, 0));
        expect.add(Arrays.asList(0, 5));
        List<List<Integer>> result = p.palindromePairs(new String[]{"a", "b", "c", "ab", "ac", "aa"});
        Collections.sort(expect, cmp);
        Collections.sort(result, cmp);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void testPalindromePairsCase4() {
        List<List<Integer>> expect = new ArrayList<List<Integer>>();
        expect.add(Arrays.asList(0, 1));
        expect.add(Arrays.asList(1, 0));
        expect.add(Arrays.asList(2, 1));
        expect.add(Arrays.asList(2, 3));
        expect.add(Arrays.asList(0, 3));
        expect.add(Arrays.asList(3, 2));
        List<List<Integer>> result = p.palindromePairs(new String[]{"ab", "ba", "abc", "cba"});
        Collections.sort(expect, cmp);
        Collections.sort(result, cmp);
        Assert.assertEquals(expect, result);
    }
}
