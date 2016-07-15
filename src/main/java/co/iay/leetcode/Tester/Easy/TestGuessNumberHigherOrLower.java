package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.GuessNumberHigherOrLower;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/7/15.
 */
public class TestGuessNumberHigherOrLower {
    GuessNumberHigherOrLower guessNumberHigherOrLower = new GuessNumberHigherOrLower();

    @Test
    public void testGuessNumberHigherOrLowerCase1() {
        int maxNumber = 1;
        guessNumberHigherOrLower.init(maxNumber);
        Assert.assertEquals(guessNumberHigherOrLower.getChosenNumber(), guessNumberHigherOrLower.guessNumber(maxNumber));
    }

    @Test
    public void testGuessNumberHigherOrLowerCase2() {
        int maxNumber = 2;
        guessNumberHigherOrLower.init(maxNumber);
        Assert.assertEquals(guessNumberHigherOrLower.getChosenNumber(), guessNumberHigherOrLower.guessNumber(maxNumber));
    }

    @Test
    public void testGuessNumberHigherOrLowerCase3() {
        int maxNumber = 3;
        guessNumberHigherOrLower.init(maxNumber);
        Assert.assertEquals(guessNumberHigherOrLower.getChosenNumber(), guessNumberHigherOrLower.guessNumber(maxNumber));
    }

    @Test
    public void testGuessNumberHigherOrLowerCase4() {
        int maxNumber = 4;
        guessNumberHigherOrLower.init(maxNumber);
        Assert.assertEquals(guessNumberHigherOrLower.getChosenNumber(), guessNumberHigherOrLower.guessNumber(maxNumber));
    }

    @Test
    public void testGuessNumberHigherOrLowerCase5() {
        int maxNumber = 101;
        guessNumberHigherOrLower.init(maxNumber);
        Assert.assertEquals(guessNumberHigherOrLower.getChosenNumber(), guessNumberHigherOrLower.guessNumber(maxNumber));
    }

    @Test
    public void testGuessNumberHigherOrLowerCase6() {
        int chosen = 6;
        int maxNumber = 10;
        guessNumberHigherOrLower.setChosenNumber(chosen);
        Assert.assertEquals(guessNumberHigherOrLower.getChosenNumber(), guessNumberHigherOrLower.guessNumber(maxNumber));
    }
}
