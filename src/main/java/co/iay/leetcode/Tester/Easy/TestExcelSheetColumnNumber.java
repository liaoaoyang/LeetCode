package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ExcelSheetColumnNumber;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/7/5.
 */
public class TestExcelSheetColumnNumber {
    ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();

    @Test
    public void testExcelSheetColumnNumberCase1() {
        Assert.assertEquals(1, excelSheetColumnNumber.titleToNumber("A"));
    }

    @Test
    public void testExcelSheetColumnNumberCase2() {
        Assert.assertEquals(27, excelSheetColumnNumber.titleToNumber("AA"));
    }

    @Test
    public void testExcelSheetColumnNumberCase3() {
        Assert.assertEquals(703, excelSheetColumnNumber.titleToNumber("AAA"));
    }
}
