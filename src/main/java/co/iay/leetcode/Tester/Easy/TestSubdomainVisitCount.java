package co.iay.leetcode.Tester.Easy;

import co.iay.leetcode.Easy.SubdomainVisitCount;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings("all")
public class TestSubdomainVisitCount {
    final private static Comparator<String> comparator = (o1, o2) -> o2.compareTo(o1);

    private SubdomainVisitCount s = new SubdomainVisitCount();

    @Test
    public void testSubdomainVisitCountCase1() {
        List<String> expected = Arrays.asList("9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com");
        List<String> result = s.subdomainVisits(new String[]{"9001 discuss.leetcode.com"});
        expected.sort(comparator);
        result.sort(comparator);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSubdomainVisitCountCase2() {
        List<String> expected = Arrays.asList(
                "901 mail.com",
                "50 yahoo.com",
                "900 google.mail.com",
                "5 wiki.org",
                "5 org",
                "1 intel.mail.com",
                "951 com"
        );
        List<String> result = s.subdomainVisits(new String[]{
                "900 google.mail.com",
                "50 yahoo.com",
                "1 intel.mail.com",
                "5 wiki.org"
        });
        expected.sort(comparator);
        result.sort(comparator);

        Assert.assertEquals(expected, result);
    }
}
