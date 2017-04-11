package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.RestoreIPAddresses;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ng on 17/3/12.
 */
public class TestRestoreIPAddresses {
    private RestoreIPAddresses r = new RestoreIPAddresses();

    @Test
    public void testRestoreIPAddressesCase1() {
        List<String> cmp = new ArrayList<String>();
        cmp.add("255.255.11.135");
        cmp.add("255.255.111.35");

        Assert.assertEquals(cmp, r.restoreIpAddresses("25525511135"));
    }

    @Test
    public void testRestoreIPAddressesCase2() {
        List<String> cmp = new ArrayList<String>();
        cmp.add("1.1.1.1");

        Assert.assertEquals(cmp, r.restoreIpAddresses("1111"));
    }

    @Test
    public void testRestoreIPAddressesCase3() {
        List<String> cmp = new ArrayList<String>();

        Assert.assertEquals(cmp, r.restoreIpAddresses("1111111111111"));
    }

    @Test
    public void testRestoreIPAddressesCase4() {
        List<String> cmp = new ArrayList<String>();

        Assert.assertEquals(cmp, r.restoreIpAddresses("256111111111"));
    }

    @Test
    public void testRestoreIPAddressesCase5() {
        List<String> cmp = new ArrayList<String>();
        cmp.add("0.10.0.10");
        cmp.add("0.100.1.0");

        Assert.assertEquals(cmp, r.restoreIpAddresses("010010"));
    }
}
