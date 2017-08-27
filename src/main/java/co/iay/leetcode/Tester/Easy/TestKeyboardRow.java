package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.KeyboardRow;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 17/2/18.
 */
public class TestKeyboardRow {
    KeyboardRow k = new KeyboardRow();

    @Test
    public void testKeyboardRowCase1() {
        Assert.assertArrayEquals(new String[]{"Alaska", "Dad"}, k.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"}));
    }
}
