package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.ExcelSheetColumnTitle;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 16/7/5.
 */
public class TestExcelSheetColumnTitle {
    ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();

    @Test
    public void testExcelSheetColumnTitleCase1() {
        Assert.assertEquals("", excelSheetColumnTitle.convertToTitle(0));
    }

    @Test
    public void testExcelSheetColumnTitleCase2() {
        Assert.assertEquals("A", excelSheetColumnTitle.convertToTitle(1));
    }

    @Test
    public void testExcelSheetColumnTitleCase3() {
        Assert.assertEquals("B", excelSheetColumnTitle.convertToTitle(2));
    }

    @Test
    public void testExcelSheetColumnTitleCase4() {
        Assert.assertEquals("AAA", excelSheetColumnTitle.convertToTitle(703));
    }

    @Test
    public void testExcelSheetColumnTitleCase5() {
        Assert.assertEquals("AB", excelSheetColumnTitle.convertToTitle(28));
    }

    @Test
    public void testExcelSheetColumnTitleCase6() {
        Assert.assertEquals("AAB", excelSheetColumnTitle.convertToTitle(704));
    }

    @Test
    public void testExcelSheetColumnTitleCase7() {
        Assert.assertEquals("AZ", excelSheetColumnTitle.convertToTitle(52));
    }

    @Test
    public void testExcelSheetColumnTitleCase8() {
        Assert.assertEquals("YZ", excelSheetColumnTitle.convertToTitle(26 * 26));
    }

    @Test
    public void testExcelSheetColumnTitleCase9() {
        Assert.assertEquals("AYZ", excelSheetColumnTitle.convertToTitle(52 * 26));
    }

    @Test
    public void testExcelSheetColumnTitleCase10() {
        Assert.assertEquals("ZA", excelSheetColumnTitle.convertToTitle(26 * 26 + 1));
    }

    @Test
    public void testExcelSheetColumnTitleCase11() {
        Assert.assertEquals("ZZ", excelSheetColumnTitle.convertToTitle(26 * 27));
    }
}
