package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.LetterCasePermutation;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestLetterCasePermutation {
    private LetterCasePermutation l = new LetterCasePermutation();

    private void runTestCase(List<String> expected, String S) {
        Collections.sort(expected);
        List<String> result = l.letterCasePermutation(S);
        Collections.sort(result);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testLetterCasePermutationCase1() {
        runTestCase(Arrays.asList("a1b2", "a1B2", "A1b2", "A1B2"), "a1b2");
    }

    @Test
    public void testLetterCasePermutationCase2() {
        runTestCase(Arrays.asList("3z4", "3Z4"), "3z4");
    }

    @Test
    public void testLetterCasePermutationCase3() {
        runTestCase(Arrays.asList("123456"), "123456");
    }

    @Test
    public void testLetterCasePermutationCase4() {
        runTestCase(Arrays.asList("c", "C"), "c");
    }

    @Test
    public void testLetterCasePermutationCase5() {
        runTestCase(Arrays.asList("c", "C"), "C");
    }
}
