package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.UniqueEmailAddresses;
import org.junit.Assert;
import org.junit.Test;

public class TestUniqueEmailAddresses {
    private UniqueEmailAddresses u = new UniqueEmailAddresses();

    @Test
    public void testUniqueEmailAddressesCase1() {
        Assert.assertEquals(2, u.numUniqueEmails(new String[]{
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"
        }));
    }
}
