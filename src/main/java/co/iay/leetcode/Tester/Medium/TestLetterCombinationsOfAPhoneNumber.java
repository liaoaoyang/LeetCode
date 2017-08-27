package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.LetterCombinationsOfAPhoneNumber;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by ng on 2017/7/2.
 */
public class TestLetterCombinationsOfAPhoneNumber {
    private LetterCombinationsOfAPhoneNumber l = new LetterCombinationsOfAPhoneNumber();

    @Test
    public void testLetterCombinationsOfAPhoneNumberCase1() {
        Assert.assertEquals(Arrays.asList(new String[]{"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"}),
                l.letterCombinations("23"));
    }

    @Test
    public void testLetterCombinationsOfAPhoneNumberCase2() {
        Assert.assertEquals(Arrays.asList(new String[]{}),
                l.letterCombinations(""));
    }

    @Test
    public void testLetterCombinationsOfAPhoneNumberCase3() {
        Assert.assertEquals(Arrays.asList(new String[]{"a", "b", "c"}),
                l.letterCombinations("2"));
    }

    @Test
    public void testLetterCombinationsOfAPhoneNumberCase4() {
        Assert.assertEquals(Arrays.asList(new String[]{}),
                l.letterCombinations("111111"));
    }
}
