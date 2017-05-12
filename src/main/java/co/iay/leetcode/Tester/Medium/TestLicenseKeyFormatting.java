package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Medium.LicenseKeyFormatting;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ng on 2017/5/12.
 */
public class TestLicenseKeyFormatting {
    private LicenseKeyFormatting l = new LicenseKeyFormatting();

    @Test
    public void testLicenseKeyFormattingCase1() {
        Assert.assertEquals("24A0-R74K", l.licenseKeyFormatting("2-4A0r7-4k", 4));
    }

    @Test
    public void testLicenseKeyFormattingCase2() {
        Assert.assertEquals("24-A0R-74K", l.licenseKeyFormatting("2-4A0r7-4k", 3));
    }

    @Test
    public void testLicenseKeyFormattingCase3() {
        Assert.assertEquals("AA-AA", l.licenseKeyFormatting("aaaa", 2));
    }

    @Test
    public void testLicenseKeyFormattingCase4() {
        Assert.assertEquals("AA-AA", l.licenseKeyFormatting("--a-a-a-a--", 2));
    }

    @Test
    public void testLicenseKeyFormattingCase5() {
        Assert.assertEquals("", l.licenseKeyFormatting("---", 3));
    }
}
